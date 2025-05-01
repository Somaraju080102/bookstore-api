package com.spring.book.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.book.dto.BookDTO;
import com.spring.book.entity.BookEntity;
import com.spring.book.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	


	public boolean storeDB(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		
		Integer bookPrice = bookEntity.getBookPrice();
		if(bookPrice>0) {
			bookRepo.save(bookEntity);
			
			return true;
			
		}
		
		return false;
		

		
	}



	public boolean updateBK(Integer id, BookDTO bookDTO) {
	
		BookEntity existing = bookRepo.findById(id).get();
		
		System.out.println(existing.getBookISBN());
		
		
//		
//		if(existing==null)
//		{
//			return false;
//		}
//		else {
//		
//		existing.setBookAuthour(bookDTO.getAuthor());
//		existing.setBookGenre(bookDTO.getGenre());
//		existing.setBookPrice(bookDTO.getPrice());
//		existing.setBookTitle(bookDTO.getTitle());
//		existing.setBookPublishedDate(bookDTO.getPublishedDate());
//		}
		return true;
		        
	}



	

}
