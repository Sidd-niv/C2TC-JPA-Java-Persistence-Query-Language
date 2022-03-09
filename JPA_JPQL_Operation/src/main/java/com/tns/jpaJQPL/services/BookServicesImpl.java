package com.tns.jpaJQPL.services;

import com.tns.jpaJQPL.dao.BookDao;
import com.tns.jpaJQPL.dao.BooksDaoImpl;
import com.tns.jpaJQPL.entities.Books;

import java.util.List;

public class BookServicesImpl implements BookService {
	
	private BookDao dao;

	public BookServicesImpl()
	{
		dao = new BooksDaoImpl();
	}

	@Override
	public Books getBookById(Integer id) {
		return dao.getBookById(id); 
		
	}

	@Override
	public List<String> getBookByTitle(String title) {
		return  dao.getBookByTitle(title);
		
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
		
	}

	@Override
	public List<String> getAllAuthors() {
		return dao.getAllAuthors();
	}

	@Override
	public List<String> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public List<String> getBooksInPriceRange(float low, float high) {
		return dao.getBooksInPriceRange(low, high);
	}

}
