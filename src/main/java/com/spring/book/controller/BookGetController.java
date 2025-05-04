package com.spring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.entity.BookEntity;
import com.spring.book.service.BookService;

@RestController
public class BookGetController {
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getAll")
	public List<BookEntity> getAllBooks(){
		
		return bookService.getBooks();
		
	}

}
