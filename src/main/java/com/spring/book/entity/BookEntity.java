package com.spring.book.entity;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
	
	private String bookTitle;
	
	private String bookAuthour;
	
	private Integer  bookPrice;
	
	private String bookGenre;
	
	@Convert(converter =  LocalDateConverter.class)
	private LocalDate bookPublishedDate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookISBN;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthour() {
		return bookAuthour;
	}

	public void setBookAuthour(String bookAuthour) {
		this.bookAuthour = bookAuthour;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public LocalDate getBookPublishedDate() {
		return bookPublishedDate;
	}

	public void setBookPublishedDate(LocalDate bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}

	public Integer getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(Integer bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	
	
	
	
	

}
