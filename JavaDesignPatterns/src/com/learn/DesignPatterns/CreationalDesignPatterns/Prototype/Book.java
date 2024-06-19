package com.learn.DesignPatterns.CreationalDesignPatterns.Prototype;

public class Book {

	
	private int bookId;
	private String bootName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBootName() {
		return bootName;
	}
	public void setBootName(String bootName) {
		this.bootName = bootName;
	}
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bootName=" + bootName + "]";
	}
	
	
}
