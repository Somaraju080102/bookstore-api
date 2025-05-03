package com.spring.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.service.BookService;

@RestController
public class BookDelete {
	
	@Autowired
	BookService bookService;
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<String> deleteBook(@PathVariable Integer id){
		
		
		boolean deleteBookDb = bookService.deleteBookDb(id);
		
		if(deleteBookDb==false) {
			return ResponseEntity.ok("404 Book Not Found");
		}
		
		return ResponseEntity.ok("Book Has Been Deleted Successfully");
		
		
	}

}
