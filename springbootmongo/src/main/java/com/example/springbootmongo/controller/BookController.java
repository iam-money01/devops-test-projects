package com.example.springbootmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmongo.entity.Book;
import com.example.springbootmongo.repo.BookRepo;


@RestController("/book")
public class BookController {

	@Autowired
	BookRepo repo;

	@PostMapping("/savebook")
	private Book saveBook(@RequestBody Book obj) {

		return repo.save(obj);

	}
	
	
	@GetMapping("/getbook/{id}")
	private ResponseEntity<Book> getEmp(@PathVariable int id) {
		Book bookObj = repo.findById(id).get();
	
		return ResponseEntity.ok(bookObj);
	}

	@GetMapping("/getbooks")
	private ResponseEntity<List<Book>> findALL() {
		return ResponseEntity.ok(repo.findAll());
	}

}
