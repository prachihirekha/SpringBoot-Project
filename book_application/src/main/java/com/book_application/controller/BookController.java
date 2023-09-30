package com.book_application.controller;

import com.book_application.entity.Book;
import com.book_application.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {
//    @GetMapping("/request")
//    public String getBook(){
//        return "there are book";
//    }
    @Autowired
    BookService bookService;
    @GetMapping("/all-book")
    public ArrayList<Book> getBook(){
       return this.bookService.getAllBook();
    }
    @GetMapping("/oneBook/{id}")
    public Book getSingleBook(@PathVariable int id ){
        return  this.bookService.getById(id);
    }
    // post
    @PostMapping("/create_book")
    public Book createBook(@RequestBody Book book){
        System.out.println("successfull insert");
        return this.bookService.addBook(book);
    }
    // for delete
    @DeleteMapping("/delete/{bookId}")
    public void deleteBook(@PathVariable int bookId){
        this.bookService.deleteBook(bookId);
    }
    @PutMapping("/books/{id}")
    public void updateBook(@RequestBody Book book,@PathVariable int id){
        this.bookService.updateBook(book,id);
    }

}