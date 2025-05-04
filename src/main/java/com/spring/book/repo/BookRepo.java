package com.spring.book.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.book.entity.BookEntity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {
	
	Page<BookEntity> findAll(Pageable pageable);

	
	

}
