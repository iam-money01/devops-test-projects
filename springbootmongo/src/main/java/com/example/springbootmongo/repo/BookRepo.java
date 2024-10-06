package com.example.springbootmongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmongo.entity.Book;


public interface BookRepo  extends MongoRepository<Book, Integer>{


}
