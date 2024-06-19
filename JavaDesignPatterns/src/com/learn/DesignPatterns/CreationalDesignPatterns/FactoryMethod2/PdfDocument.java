package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public class PdfDocument implements Document{

	@Override
	public void open() {
		System.out.println("Opened Pdf document");
	}

	@Override
	public void close() {
		System.out.println("Closed Pdf document");
	}

	@Override
	public void save() {
		System.out.println("Saved Pdf document");
	}

}
