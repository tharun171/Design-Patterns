package com.learn.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Phone {


	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int batterySize;
	
	
	
	public Phone(String oS, int ram, String processor, double screenSize, int batterySize) {
		super();
		OS = oS;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.batterySize = batterySize;
	}
	
	
	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", batterySize=" + batterySize + "]";
	}


	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	
	
}
