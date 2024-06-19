package com.learn.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class MainClass {

	public static void main(String[] args) {


		//when we want to send some data to variables in a class and leave some
		//we need different constructors for different combinations
		//To Solve this we can have Builder Pattern
		
		//Builder Pattern - Creational Design Pattern
		
		
		//Assume user wants phone with 
		//OS - android,4gb ram,any processor,5.5,3100
		
		Phone UserPhone1 = new PhoneBuilder().setOS("android")
				.setRam(4)
				//processor can be any, so we dont know
				.setScreenSize(5.5)
				.setBatterySize(3100)
				.GetPhone();
		
		System.out.println(UserPhone1);
		//instead of null, we can get default values from constructor from phone class
	}

}
