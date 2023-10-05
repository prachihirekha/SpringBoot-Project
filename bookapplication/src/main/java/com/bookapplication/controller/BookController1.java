package com.bookapplication.controller;

import com.bookapplication.model.Book1;
import com.bookapplication.service.BookService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController1 {
    @Autowired
    private BookService1 bookService1;

    @PostMapping("/books")
    public Book1 insertOneBook(@RequestBody Book1 b) {
        b = this.bookService1.insertOneBook(b);
        return b;
    }

    @PostMapping("/multiple-book")
    public String insertMultipleBooks(@RequestBody List<Book1> book1s) {
        bookService1.insertMultipleBook(book1s);
        return "code is run";
    }

    @GetMapping("all-books")
    public List<Book1> getAllBooks() {
        return bookService1.getAllBooks();
    }

    @GetMapping("/single-book/{id}")
    public Optional<Book1> getByID(@PathVariable("id") int id) {
        return bookService1.getById(id);
    }

    @DeleteMapping("/deleteby/{id}")
    public String deleteById(@PathVariable int id) {
        bookService1.deleteById(id);
        return "delete Successfully";
    }

    @PutMapping("updateby/{id}")
    public Optional<Book1> updateById(@PathVariable int id,@RequestBody Book1 book){
        return bookService1.updateById(id,book);

    }

    @PostMapping("/multiple_book_data/{value}")
    public List<Book1> bookMultipleData(@PathVariable ("value") int value){
        System.out.println("successfully inserted");
        return bookService1.bookMultipleData(value);
    }
}
