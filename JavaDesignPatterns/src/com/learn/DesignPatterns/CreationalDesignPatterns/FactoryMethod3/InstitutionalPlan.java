package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

public class InstitutionalPlan
extends Plan{
	
	//private Double rate;

	//@Override
	void getRate() {
		rate = (double) 9;
		System.out.println("Institutional Rate 9Rs");
	}


}
