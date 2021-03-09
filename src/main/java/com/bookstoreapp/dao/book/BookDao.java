package com.bookstoreapp.dao.book;
import java.util.*;

public interface BookDao {
	public List<Book> allBooks();
	public Book addBook(Book book);
}
