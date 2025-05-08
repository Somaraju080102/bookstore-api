package com.spring.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
		
		System.out.println(existing.toString());
		
		System.out.println(bookDTO.toString());
		
		existing.setBookAuthour(bookDTO.getAuthor());
		existing.setBookGenre(bookDTO.getGenre());
		existing.setBookPrice(bookDTO.getPrice());
		existing.setBookTitle(bookDTO.getTitle());
		existing.setBookPublishedDate(bookDTO.getPublishedDate());
		
		bookRepo.save(existing);
		return true;
		        
	}


	public boolean deleteBookDb(Integer id) {
		
		Optional<BookEntity> byId = bookRepo.findById(id);
		
		if(byId.isEmpty()) {
			
			return false;
			
		}
		
		else {
			bookRepo.deleteById(id);
		}
		
		return true;
		
	}



	public List<BookEntity> getBooks() {
		
		List<BookEntity> all = bookRepo.findAll();
		
		return all;
		
		
	}






	public Page<BookEntity> getAllBooks(int page, int size, String sortBy) {
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).descending());
	    return bookRepo.findAll(pageable);
	}



	public List<BookEntity> findBooksprice(Integer minPrice, Integer maxPrice) {
		// TODO Auto-generated method stub
		
		return bookRepo.findByBookPriceBetween(minPrice, maxPrice);
		
	}



	public List<BookEntity> findBookByAuthor(String author) {
	    return bookRepo.findByBookAuthour(author);  // assuming typo is intentional
	}



	public List<BookEntity> findByLetter(String prefix) {
		// TODO Auto-generated method stub
		
		List<BookEntity> byBookTitleStartingWithIgnoreCase = bookRepo.findByBookTitleStartingWithIgnoreCase(prefix);
		return byBookTitleStartingWithIgnoreCase;
		
	}




	

}
