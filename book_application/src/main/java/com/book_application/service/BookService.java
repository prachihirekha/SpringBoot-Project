package com.book_application.service;

import com.book_application.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class BookService {

    private static ArrayList<Book>list=new ArrayList<>();
    static {
        list.add(Book.builder().bookName("developer book").id(1).title("java developer").author("ramu").build());
        list.add(Book.builder().bookName("backend book").id(2).title("java developer").author("samu").build());
        list.add(Book.builder().bookName("frontend book").id(3).title("java developer").author("komy").build());
        list.add(Book.builder().bookName("full stack book").id(4).title("java developer").author("tomy").build());

    }

    public static ArrayList<Book> getAllBook() {
        return list;
    }
    public Book getById(int id){

        Book book =null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
    public Book addBook(Book b){
        list.add(b);
        return b;
    }

    public void deleteBook(int bookId) {
        list.stream().filter(book -> book.getId()!=bookId).collect(Collectors.toList());

        }

    public void updateBook(Book book, int id) {
        list.stream().map(e->{
            if(e.getId()==id){
                e.setBookName("oops");
                e.setAuthor("prachi");
            }
            return e;
        }).collect(Collectors.toList());
    }
}
