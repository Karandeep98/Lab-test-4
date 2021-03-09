package com.bookstoreapp.dao.book;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "publisher")
public class Publisher {    
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private String code;
	 
	 @Column(nullable = false, updatable = false)
	 	private String name;
	 
	 	@JoinColumn(name = "book_id_fk", nullable = false)
		@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
		private Book book;
 

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publisher [code=").append(code).append(", name=").append(name).append("]");
		return builder.toString();
	}
	public Publisher() {}    
    public Publisher(String code, String name) {
        this.code = code;
        this.name = name;
    }

 

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
  
}