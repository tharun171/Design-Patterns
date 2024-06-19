package com.learn.DesignPatterns.CreationalDesignPatterns.BuilderPattern;


//creating to use this class for - Builder Pattern
//Builder Pattern - Creational Design Pattern
public class PhoneBuilder {

	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int batterySize;
	
	//Creating builder method to create object
	public Phone GetPhone()
	{
		//Ordering based on phone class constructor
		return new Phone(OS,ram,processor,screenSize,batterySize);
	}
	
	//setters -  we give return type as phone itself, so
	//we return the same object after setting something
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;	//returns the same object
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBatterySize(int batterySize) {
		this.batterySize = batterySize;
		return this;
	}
	
	
	//we wont be needing getters, as this is Builder class
	
	
	
}
