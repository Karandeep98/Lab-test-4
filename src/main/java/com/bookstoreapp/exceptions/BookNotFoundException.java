package com.bookstoreapp.exceptions;

public class BookNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -7843949554760027657L;

	public BookNotFoundException(String message) {
		super(message);
	}
}