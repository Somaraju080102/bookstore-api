package com.spring.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.dto.BookDTO;
import com.spring.book.entity.BookEntity;
import com.spring.book.service.BookService;

@RestController
public class BookUpdater {
	
	@Autowired
	BookService bookService;
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateBook(@PathVariable Integer  id, @RequestBody BookDTO bookDTO){
		
		boolean updateBK = bookService.updateBK(id,bookDTO);
		
		
		if(updateBK==true) {
			return ResponseEntity.ok("Partial Update done");
		}
		else {
			return ResponseEntity.ok("Book Not Found ");
		}
		
	}

}
