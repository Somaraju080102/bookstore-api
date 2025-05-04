package com.spring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.entity.BookEntity;
import com.spring.book.service.BookService;

@RestController
public class BookDynamicContoller {
	

	
	@Autowired
	BookService bookService;
	@GetMapping("/booksDateSort")
	public ResponseEntity<List<BookEntity>> getBooks(
			@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "10")int size,
			@RequestParam(defaultValue = "bookPublishedDate")String sortBy
			){
		Page<BookEntity> books = bookService.getAllBooks(page, size, sortBy);
	    return ResponseEntity.ok(books.getContent());
		
	}
		
		
	
}
