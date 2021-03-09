package com.bookstoreapp.service;

import java.util.List;
import com.bookstoreapp.dao.book.Book;
import com.bookstoreapp.dao.book.BookDao;


public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	

	public BookServiceImpl() {
	}

	@Override
	public List<Book> allBooks() {
		
		return bookDao.allBooks();
	}

	@Override
	public Book addBook(Book book) {
	
		return bookDao.addBook(book);
	}

}
