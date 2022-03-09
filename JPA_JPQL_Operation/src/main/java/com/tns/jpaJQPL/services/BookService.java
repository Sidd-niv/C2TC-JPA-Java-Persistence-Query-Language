package com.tns.jpaJQPL.services;

import java.util.List;

import com.tns.jpaJQPL.entities.Books;


public interface BookService {
	
	public Books getBookById(Integer id);
	
	public List<String> getBookByTitle(String title);
	
	public Long getBookCount();
	
	public List<String> getAllAuthors();
	
	public List<String> getAllBooks();
	
	public List<String> getBooksInPriceRange(float low, float high);
	
	

}
