package com.gai.upload.controller;

import com.gai.upload.entity.Book;
import com.gai.upload.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaigaicoming on 2019/10/21.
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping(value = "/bookOps")
    public int bookOps(){
        Book book = new Book();
        book.setName("朝花夕拾");
        book.setAuthor("鲁迅");
        return bookService.addBook(book);
    }
}
