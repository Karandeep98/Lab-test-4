package com.bookstoreapp.service;

import java.util.List;

import com.bookstoreapp.dao.book.Book;

public interface BookService {
	public List<Book> allBooks();
	public Book addBook(Book book);
	
}
