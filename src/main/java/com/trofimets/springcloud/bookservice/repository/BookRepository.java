package com.trofimets.springcloud.bookservice.repository;

import com.trofimets.springcloud.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {
}
