package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod;

public class CreatorFactory {

	//abstract method
	public static OS createOs(String str)
	{
		if(str.equalsIgnoreCase("android"))
		{
			return new Android();
		}
		else if(str.equalsIgnoreCase("ios"))
		{
			return new IOS();
		}
		else
		{
			return new Windows();
		}
	}
	
}
