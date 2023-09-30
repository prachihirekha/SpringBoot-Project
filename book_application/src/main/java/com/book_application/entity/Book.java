package com.book_application.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private int id;
    private String title;
    private  String author;
    private  String bookName;

}
