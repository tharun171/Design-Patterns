package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod;

public class MainClass {

	public static void main(String[] args) {
		
		
		//we specify name of os, we want to get
		//android, ios, windows
		
		
		//assume obj1 want android
		OS obj1 = CreatorFactory.createOs("android");
		obj1.GetOs();
		
		//assume obj1 want IOS
		OS obj2 = CreatorFactory.createOs("IOS");
		obj2.GetOs();
		
		//assume obj1 want Windows
		OS obj3 = CreatorFactory.createOs("windows");
		obj3.GetOs();

	}

}
