package com.learn.DesignPatterns.StructuralDesignPattern.CompositePattern;

public class Leaf implements Component{

	
	int price;
	String name;
	
	@Override
	public void showPrice() {
		System.out.println(name+": "+price);
	}

	public Leaf(int price,String name)
	{
		super();
		this.price=price;
		this.name=name;
	}
}
