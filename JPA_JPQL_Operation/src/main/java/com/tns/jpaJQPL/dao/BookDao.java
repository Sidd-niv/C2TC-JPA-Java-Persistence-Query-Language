package com.tns.jpaJQPL.dao;

import java.util.List;

import com.tns.jpaJQPL.entities.Books;



public interface BookDao 
{
	
	// Declaring the read operation
	
	public Books getBookById(Integer id);
	
	public List<String> getBookByTitle(String title);
	
	public Long getBookCount();
	
	public List<String> getAllAuthors();
	
	public List<String> getAllBooks();
	
	public List<String> getBooksInPriceRange(float low, float high);
	
	
	

}
