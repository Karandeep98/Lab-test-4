package com.bookstoreapp.dao.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.BatchSize;


@Entity
@Table(name = "book")
public class Book {

     @Id
     @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String isbn;
    @NotNull
    private String name;
    @OneToOne(mappedBy = "book")
    private Publisher publisher;
    
	@BatchSize(size = 3)
	@JoinColumn(name = "book_id_fk", nullable = false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 private List<Chapter> chapters= new ArrayList<>();

 

    public Book() {
    }

 

    public Book(String isbn, String name, Publisher publisher) {
        this.isbn = isbn;
        this.name = name;
        this.publisher = publisher;
    }

 

    public String getIsbn() {
        return isbn;
    }

 

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public Publisher getPublisher() {
        return publisher;
    }

 

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

 

    public List<Chapter> getChapters() {
        return chapters;
    }

 

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", name=").append(name).append(", publisher=")
				.append(publisher).append(", chapters=").append(chapters).append("]");
		return builder.toString();
	}

 

  
}
 