package com.chandu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.entity.Book;
import com.chandu.repository.BookRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	
	@GetMapping()
	public List<Book> getAllBookRecords(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Heello";
	}
	
	
	@GetMapping(value = "{bookId}")
	public Book getBookById(@PathVariable(value = "bookId") Long bookId) {
		return bookRepository.findById(bookId).get();
	}
	
	
	
	@PostMapping
	public Book createRecord(@RequestBody @Valid Book bookRecord ) {
		return bookRepository.save(bookRecord);
	}
	
	
	@PutMapping
	public Book updateBookRecord(@RequestBody @Valid Book bookRecord) throws NotFoundException {

	    // Check if the book record or its ID is null
	    if (bookRecord == null || bookRecord.getBookId() == null) {
	        throw new NotFoundException();
	    }

	    // Find the existing book by ID
	    Book existingBook = bookRepository.findById(bookRecord.getBookId())
	            .orElseThrow(() -> new NotFoundException());

	    // Update the fields of the existing book
	    existingBook.setName(bookRecord.getName());
	    existingBook.setSummary(bookRecord.getSummary());
	    existingBook.setRating(bookRecord.getRating());

	    // Save and return the updated book record
	    return bookRepository.save(existingBook);
	}

	
	

}
