package com.spring.book.dto;

import java.time.LocalDate;

public class BookDTO {
	
	    private String title;
	    private String author;
	    private Integer price;
	    private String genre;
	    private LocalDate publishedDate;
	    
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public LocalDate getPublishedDate() {
			return publishedDate;
		}
		public void setPublishedDate(LocalDate publishedDate) {
			this.publishedDate = publishedDate;
		}
	    
	    
	

}
