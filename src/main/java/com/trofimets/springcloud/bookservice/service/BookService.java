package com.trofimets.springcloud.bookservice.service;

import com.trofimets.springcloud.bookservice.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();
}
