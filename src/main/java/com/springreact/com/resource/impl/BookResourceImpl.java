package com.springreact.com.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.com.domain.Book;
import com.springreact.com.resource.Resource;
import com.springreact.com.service.ServiceForAll;



@RestController
@RequestMapping("/books")
@CrossOrigin(origins="*")
public class BookResourceImpl implements Resource<Book> {

	@Autowired
	@Qualifier("book")
	public  ServiceForAll<Book> bookService;
	
	@Override
	public ResponseEntity<Collection<Book>> findAll() {
		
		System.out.println("findAll");
		return new ResponseEntity<Collection<Book>>(bookService.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> findById(Long id) {
		System.out.println("findById");
		return new ResponseEntity<>(bookService.findById(id),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> save(Book book) {
		System.out.println("save");
		return new ResponseEntity<>(bookService.save(book),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Book> update(Book book) {
		System.out.println("update");
		return new ResponseEntity<>(bookService.update(book),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> deleteById(Long id) {
		System.out.println("deleteById");
		return new ResponseEntity<>(bookService.deleteById(id),HttpStatus.OK);
	}

}
