package com.spring.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.book.entity.BookEntity;
import com.spring.book.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	


	public void storeDB(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		bookRepo.save(bookEntity);

		
	}

}
