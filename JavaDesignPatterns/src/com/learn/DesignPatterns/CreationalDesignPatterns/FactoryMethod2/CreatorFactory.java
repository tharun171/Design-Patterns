package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public abstract class CreatorFactory {

	public abstract Document createDocument();
	
	public Document openDocument()
	{
		//Document is getting opened
		System.out.println("invoking a type of document...");
		Document doc = createDocument();
		return doc;
	}
}
