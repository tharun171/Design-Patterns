package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

public class CommercialPlan 
extends Plan{

	//@Override
	void getRate() {
		rate = (double) 7;
		System.out.println("Commercial Rate 7Rs");
	}

	
}
