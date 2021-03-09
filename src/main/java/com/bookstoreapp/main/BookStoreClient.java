package com.bookstoreapp.main;

import java.util.ArrayList;
import java.util.List;

import com.bookstoreapp.dao.book.Book;
import com.bookstoreapp.dao.book.Chapter;
import com.bookstoreapp.dao.book.Publisher;
import com.bookstoreapp.service.BookService;
import com.bookstoreapp.service.BookServiceImpl;
import com.bookstoreapp.service.BookStoreService;


public class BookStoreClient {
	public static void main(String[] args) {
		BookService bookStoreService = new BookServiceImpl();

		//persisting object graph
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
		chapters.add(chapter2);

		book.setChapters(chapters);
		bookStoreService.addBook(book);
		

		List<Book> books =bookStoreService.allBooks();
		books.forEach(System.out::println);		

	}
}





