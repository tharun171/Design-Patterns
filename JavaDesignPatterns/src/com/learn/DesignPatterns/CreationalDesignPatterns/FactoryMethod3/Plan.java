package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

public abstract class Plan {
	
	
	protected Double rate;
	
	abstract void getRate();
	
	public Double calculateBill(int units)
	{
		return rate*units;
	}

}
