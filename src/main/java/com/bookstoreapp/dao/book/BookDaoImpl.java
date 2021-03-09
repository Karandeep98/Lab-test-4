package com.bookstoreapp.dao.book;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookstoreapp.exceptions.DataAccessException;

public class BookDaoImpl implements BookDao {

	private SessionFactory factory;

	public BookDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	public BookDaoImpl() {
			}
	@Override
	public List<Book> allBooks() {
		Session session = factory.openSession();
		List<Book> books = session.createQuery("select b from Book b").getResultList();
		session.close();
		return books;
	}
	@Override
	public Book addBook(Book book) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		try {
			tx.begin();
			session.save(book);
			tx.commit();

		} catch (HibernateException ex) {
			tx.rollback();
			throw new DataAccessException(ex.getMessage());
		}finally {
			if(session!=null)
			session.close();
		}
		return book;
	}
}
