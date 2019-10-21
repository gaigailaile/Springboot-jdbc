package com.gai.upload.service.impl;

import com.gai.upload.dao.BookDao;
import com.gai.upload.entity.Book;
import com.gai.upload.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaigaicoming on 2019/10/21.
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBookById(Integer id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book getBookById(Integer id) {
        return bookDao.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
}
