package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public class MainClass {

	public static void main(String[] args)
	{
		
		//Document - interface, called Product
		//PdfDocument, WordDocument - classes that implement Document, these 
		//are called Concrete products
		
		//getting pdf document
		
		//Creator factory  is an abstract class
		//returns object of type product
		
		//ConcreteCreator - classes that implement concreteFactory
		CreatorFactory factory1 = new ConcreteCreatorPdfDoc();
		Document pdfDoc = factory1.openDocument();
		pdfDoc.open();
		pdfDoc.close();
		pdfDoc.save();
		
		CreatorFactory factory2 = new ConcreteCreatorWordDoc();
		Document WordDoc = factory2.openDocument();
		WordDoc.open();
		WordDoc.close();
		WordDoc.save();
	}
}
