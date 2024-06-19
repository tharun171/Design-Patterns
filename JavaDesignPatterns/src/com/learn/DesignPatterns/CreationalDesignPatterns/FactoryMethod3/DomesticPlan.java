package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

public class DomesticPlan extends Plan{

	
	//@Override
	void getRate() {
		rate = (double) 5;
		System.out.println("Domestic Plan Rate - 5Rs");
	}



}
