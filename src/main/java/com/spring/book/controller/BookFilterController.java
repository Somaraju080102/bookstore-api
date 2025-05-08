package com.spring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.dto.BookDTO;
import com.spring.book.entity.BookEntity;
import com.spring.book.service.BookService;

@RestController
public class BookFilterController {
	
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/price")
	public ResponseEntity<List<BookEntity>> getPrice(
			@RequestParam(required = false)Integer minPrice,
			@RequestParam(required = false)Integer maxPrice
			){
		
		List<BookEntity> booksprice = bookService.findBooksprice(minPrice,maxPrice);
		
		return ResponseEntity.ok(booksprice);
		
		
	}
	
	@GetMapping("/bookAuthor")
	public ResponseEntity<List<BookEntity>> getBookByAuthor(
	        @RequestParam(required = false) String author) {
	    
	    List<BookEntity> books = bookService.findBookByAuthor(author);
	    return ResponseEntity.ok(books);
	}
	
	
	@GetMapping("/letter")
	public ResponseEntity<List<BookEntity>> getBookByLetter(
			@RequestParam(required = false)String prefix
			){
		List<BookEntity> byLetter = bookService.findByLetter(prefix);
		
		return ResponseEntity.ok(byLetter);
		
		
	}

		
	
}
