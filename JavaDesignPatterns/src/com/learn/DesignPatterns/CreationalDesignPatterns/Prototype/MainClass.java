package com.learn.DesignPatterns.CreationalDesignPatterns.Prototype;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//prototype
		//we dont create object everytime thats connected to db
		//we create second object from the first object
		//without hitting db again and again
		
		
		BookShop bkShop = new BookShop();
		bkShop.setBookShopName("novelty");
		bkShop.loadData();
		
		
		
		
		//clone() - create new object from old object
		//assing to give load data books from bkshop
		//to achieve cloning we need to implement cloneable for bookshop
		//and override a clone method
		//clone() method return object type, we need to convert it
		BookShop bkShop2 = (BookShop) bkShop.clone();
		
		//after cloing we remove something from first bookshop
		//index 2 - book no 3
				bkShop.getBooks().remove(2);
				System.out.println(bkShop);
		
		bkShop2.setBookShopName("a1");
		
		System.out.println(bkShop2);
		
	}

}
