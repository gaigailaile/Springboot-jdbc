package com.gai.upload.service;

import com.gai.upload.entity.Book;

import java.util.List;

/**
 * Created by gaigaicoming on 2019/10/21.
 */
public interface BookService {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book getBookById(Integer id);

    public List<Book> getAllBooks();
}
