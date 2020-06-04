package com.springreact.com.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springreact.com.domain.Book;
import com.springreact.com.service.BookService;
import com.springreact.com.service.ServiceForAll;



@Service
@Qualifier("book")
public class BookServiceImpl implements ServiceForAll<Book> {

	private Long bookId = 100L;
	
	private Map<Long,Book> bookMap = new HashMap<Long,Book>();
	
	
	{
		
		Book book = new Book();
		book.setId(bookId);
		book.setAuthor("Abhinav");
		book.setCoverPhotoURL("abhinav.com");
		book.setIsbnNumber(771994L);
		book.setLanguage("Hindi");
		book.setPrice(50d);
		book.setTitle("Belive In Yourself");

		bookMap.put(book.getId(),book);
}
	
	
	
	@Override
	public Collection<Book> findAll() {
		
		System.out.println(" Service find all book");
		return bookMap.values();
	}

	@Override
	public Book findById(Long id) {

		
		return bookMap.get(id);
	}

	@Override
	public Book save(Book book) {

		Long newBookId = ++bookId;
		book.setId(newBookId);
		bookMap.put(book.getId(), book);
		
		return bookMap.get(newBookId);
	}

	@Override
	public Book update(Book book) {
	
		bookId = book.getId();
		if(bookMap.get(bookId)!= null) {
			
			bookMap.put(bookId, book);
			return bookMap.get(bookId);
		}
		return null;
	}

	@Override
	public Book deleteById(Long id) {
	
		if(bookMap.get(id) != null) {
			
			bookMap.remove(id);
		}
		
		return null;
	}

}
