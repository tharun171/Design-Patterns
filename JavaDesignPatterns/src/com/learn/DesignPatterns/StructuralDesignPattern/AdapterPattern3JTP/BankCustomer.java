package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern3JTP;

import java.util.Scanner;

public class BankCustomer 
extends BankDetails 
implements CreditCard{
	
	//New Method to get user bank details
	@Override
	public void giveBankDetails()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Details ->");
			System.out.println("Enter customer name: ");
			String customerName = sc.nextLine();
			System.out.println("Enter account number: ");
			long accntNo = sc.nextLong();
			System.out.println("Enter bank name: ");
			String bankName = sc.next();
			
			setAccHolderName(customerName);
			setAccNumber(accntNo);
			setBankName(bankName);
			
			sc.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		
		long accountNum = getAccNumber();
		String accHolderName = getAccHolderName();
		String bankName = getBankName();
		
		return ("The account number "+accountNum+" of "+accHolderName+" is in the bank: "+bankName);
	}

}
