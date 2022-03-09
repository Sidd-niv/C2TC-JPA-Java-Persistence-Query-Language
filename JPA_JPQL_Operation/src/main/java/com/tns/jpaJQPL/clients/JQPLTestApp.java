package com.tns.jpaJQPL.clients;

import com.tns.jpaJQPL.entities.Books;
import com.tns.jpaJQPL.services.BookService;
import com.tns.jpaJQPL.services.BookServicesImpl;

public class JQPLTestApp {

	public static void main(String[] args) {
		
		Books object = new Books();
		
		int num = 0;
		BookService dataObject = new BookServicesImpl();
		
		System.out.println("=========================================================================================");
		// Retrieve all authors from database
		for( String book: dataObject.getAllAuthors()) 
		{
			num++;
			System.out.println("Arthor name "+num+": "+book+"\n");
		}
		System.out.println("=========================================================================================");
		num=0; 
		// Retrieve all books from database
		for(String book: dataObject.getAllBooks())
		{
			num++;
			System.out.println("Book"+num+": "+book+"\n");
		}
		System.out.println("=========================================================================================");
		// finding the books by id 
		object = dataObject.getBookById(101);
		System.out.println("Book at id: 101 = "+object.getTitle());
		System.out.println("=========================================================================================");
		num=0; 
		// finding the book by name from database
		for(String book: dataObject.getBookByTitle("Java"))
		{
			num++;
			System.out.println("Book by Java name"+num+": "+book+"\n");
		}
		System.out.println("=========================================================================================");
		// finding the total number if books
		System.out.println("Total no of books:  "+dataObject.getBookCount()+"\n");
		System.out.println("=========================================================================================");
		num=0; 
		// Finding the books in a price range 
		for(String book: dataObject.getBooksInPriceRange(460.00f, 700.00f))
		{
			num++;
			System.out.println("Book"+num+": "+book+"\n");
		}

		System.out.println("=========================================================================================");
		

	}

}
