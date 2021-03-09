package com.bookstoreapp.dao.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chapter")
public class Chapter {
	private String title;
	@Id 
	private Integer chapterNumber;
	
	public Chapter() {}	
	public Chapter(String title, Integer chapterNumber) {
		this.title = title;
		this.chapterNumber = chapterNumber;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chapter [title=").append(title).append(", chapterNumber=").append(chapterNumber).append("]");
		return builder.toString();
	}
	
	
}














