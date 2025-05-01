package com.spring.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.entity.BookEntity;
import com.spring.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;	
	
	@PostMapping("/store")
	public ResponseEntity<String> storeData(@RequestBody BookEntity bookEntity){
		
		boolean val = bookService.storeDB(bookEntity);
		
		
		
		if(val==true) {
			return ResponseEntity.ok("Saved");
		}
		
		else {
			return ResponseEntity.ok("Price Cannot be less than 0");
		}

		
		
		
	}

}
