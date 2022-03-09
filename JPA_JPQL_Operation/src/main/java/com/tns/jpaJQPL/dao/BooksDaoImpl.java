package com.tns.jpaJQPL.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tns.jpaJQPL.entities.Books;

public class BooksDaoImpl implements BookDao{
	
	private EntityManager entityManager;
	
	public BooksDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Books getBookById(Integer id) {
		return entityManager.find(Books.class, id);
	}

	@Override
	public List<String> getBookByTitle(String title) 
	{
		String queryOne = "Select b.title from Books b where b.title like :ptitle";
		TypedQuery<String> query = entityManager.createQuery(queryOne, String.class);
		query.setParameter("ptitle", title+"%");
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		String queryOne = "Select count(b.id) from Books b";
		TypedQuery<Long> query = entityManager.createQuery(queryOne, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<String> getAllAuthors() {
		Query query = entityManager.createNamedQuery("getAllAuthors");
		@SuppressWarnings("unchecked")
		List<String> authorList = query.getResultList();
		return authorList;
	}

	@Override
	public List<String> getAllBooks() {
		String queryOne = "Select b.title from Books b";
		TypedQuery<String> query = entityManager.createQuery(queryOne, String.class);
		List<String> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<String> getBooksInPriceRange(float low, float high) {
		String qStr = "SELECT b.title FROM Books b WHERE b.price between :low and :high";
		TypedQuery<String> query = entityManager.createQuery(qStr, String.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<String> bookLists = query.getResultList();
		return bookLists;
	}

}
