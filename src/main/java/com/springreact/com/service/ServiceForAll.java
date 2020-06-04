package com.springreact.com.service;

import java.util.Collection;

import com.springreact.com.domain.Book;



public interface ServiceForAll<T> {

	
	Collection<T> findAll();
		
	T findById(Long id);
	
	T save(T t);
	 
	T update(T t);
	
	T deleteById(Long id);
	
}
