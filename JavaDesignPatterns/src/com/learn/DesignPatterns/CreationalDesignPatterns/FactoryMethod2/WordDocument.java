package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public class WordDocument implements Document{

	@Override
	public void open() {
		System.out.println("opened word document");
	}

	@Override
	public void close() {
		System.out.println("closed word document");
	}

	@Override
	public void save() {
		System.out.println("saved word document");
	}

}
