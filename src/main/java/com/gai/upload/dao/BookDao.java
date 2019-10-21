package com.gai.upload.dao;

import com.gai.upload.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaigaicoming on 2019/10/21.
 */
@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addBook(Book book){
        return jdbcTemplate.update("INSERT INTO book(name,author) VALUES (?,?)",
                book.getName(),book.getAuthor());
    }

    public int deleteBookById(Integer id){
        return jdbcTemplate.update("DELETE FROM book WHERE id=?",id);
    }

    public int updateBook(Book book){
        return jdbcTemplate.update("UPDATE book SET name=?,author=? WHERE id=?",
                book.getName(),book.getAuthor(),book.getId());
    }

    public Book getBookById(Integer id){
        return jdbcTemplate.queryForObject("select * from book where id=?",
                new BeanPropertyRowMapper<Book>(),id);
    }

    public List<Book> getAllBooks(){
        return jdbcTemplate.query("select * from book",new BeanPropertyRowMapper<>(Book.class));
    }
}
