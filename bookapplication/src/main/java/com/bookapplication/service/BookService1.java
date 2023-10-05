package com.bookapplication.service;

import com.bookapplication.doe.BookRepository1;
import com.bookapplication.model.Book1;
import com.bookapplication.util.GenerateAuthorName;
import com.bookapplication.util.GenerateBookName;
import com.bookapplication.util.GenerateDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService1 {

    @Autowired
    private BookRepository1 bookRepository1;

    public Book1 insertOneBook(Book1 b) {
        System.out.println("success");
        return bookRepository1.save(b);

    }


    public void insertMultipleBook(List<Book1> book1s) {
        for (Book1 book1 : book1s) {
            System.out.println(book1);
            bookRepository1.save(book1);
        }
    }
    public List<Book1> bookMultipleData(int size){
        List<Book1> list= new ArrayList<>();
        for(int i =0;i<size;i++){
            Book1 b=Book1.builder().bookName(GenerateBookName.bookName()).authorName(GenerateAuthorName.authorName())
                    .date(GenerateDate.date()).build();
            list.add(b);
        }
        return bookRepository1.saveAll(list);

    }

    public List<Book1> getAllBooks() {
        return bookRepository1.findAll();
    }

    public Optional<Book1> getById(int id) {
        return bookRepository1.findById(id);
    }

    public void deleteById(int id) {
        bookRepository1.deleteById(id);
    }

    public Optional<Book1> updateById(int id, Book1 book1) {
        Optional<Book1> bookId = bookRepository1.findById(id);
        if (bookId != null) {
            book1.setId(id);
            bookRepository1.save(book1);
        }
        return bookId;
    }
}

