package com.learn.DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	private String BookShopName;
	
	List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book b)
	{
		books.add(b);
	}

	public String getBookShopName() {
		return BookShopName;
	}

	public void setBookShopName(String bookShopName) {
		BookShopName = bookShopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "\nBookShop [BookShopName=" + BookShopName + ", books=" + books + "]";
	}
	
	//adding data manually
	//assume data coming from database
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book b = new Book();
			b.setBookId(i);
			b.setBootName("book "+i);
			//adding books to list
			getBooks().add(b);
		}
	}

	
	//override clone method
	//source - override/implement methods - clone
	
	//gives shallow cloning - removing something, removes from all
	//this means, single object has reference to all
	
	//we need deep cloning
	//to achieve this give return type Object to this class name
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		//when return type is Object
		//return super.clone();
		
		//deep cloning
		//we are not using loaddata method coz we dont need to hit db that many times
		BookShop bs = new BookShop();
		for(Book b:this.getBooks())
		{
			bs.getBooks().add(b);
		}
		return bs;
	}
}
