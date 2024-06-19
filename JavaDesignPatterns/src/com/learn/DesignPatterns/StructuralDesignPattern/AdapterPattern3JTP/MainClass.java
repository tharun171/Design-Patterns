package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern3JTP;

public class MainClass {

	public static void main(String[] args) {
		
		
		CreditCard targetInterface = new BankCustomer();
		//get Details from user
		targetInterface.giveBankDetails();
		//show details
		System.out.println(targetInterface.getCreditCard());
	}

}
