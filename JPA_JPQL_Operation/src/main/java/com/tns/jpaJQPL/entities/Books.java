package com.tns.jpaJQPL.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;




// Defining the entity table with @Entity
@Entity
// Defining the table name with @Table
@Table(name="books")
@NamedQueries(@NamedQuery(name="getAllAuthors", query="Select b.author from Books b "))
public class Books implements Serializable {
	

	// Defining the serializable_id
	private static final long serialVersionUID = 1L;
	
	// Declaring the private class variable
	// And defining the table columns with @columns
	
	//Defining the primary key with @Id
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private Float price;

	
	// Defining the getter and setter methods to read and write private methods 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
