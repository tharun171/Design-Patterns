package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public class ConcreteCreatorPdfDoc extends CreatorFactory{

	@Override
	public Document createDocument() {
		return new PdfDocument();
	}

}
