package com.springreact.com.service;

import java.util.Collection;

import com.springreact.com.domain.Book;



public interface BookService {

	
	Collection<Book> findAll();
		
	Book findById(Long id);
	
	Book save(Book book);
	 
	Book update(Book book);
	
	Book deleteById(Long id);
	
}
