package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod2;

public class ConcreteCreatorWordDoc extends CreatorFactory{

	@Override
	public Document createDocument() {
		return new WordDocument();
	}

}
