package com.spring.book.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.book.dto.BookDTO;
import com.spring.book.entity.BookEntity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {
	
	Page<BookEntity> findAll(Pageable pageable);
	
	
	List<BookEntity> findByBookPriceBetween(Integer min, Integer max);
	
	List<BookEntity> findByBookAuthour(String bookAuthour);
	
	List<BookEntity> findByBookTitleStartingWithIgnoreCase(String prefix);
	
	

}
