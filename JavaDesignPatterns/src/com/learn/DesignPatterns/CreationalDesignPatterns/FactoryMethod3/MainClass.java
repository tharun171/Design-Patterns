package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Generate Bills
		
		System.out.println("We have these types of plans");
		System.out.println("1.Domestic\n2.Commercial\n3.Institutional");
		System.out.println("Choose from one");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice in words -");
		String planToChoose = sc.nextLine();
		
		int noOfUnitsUsed = 11;
		Plan userChosedPlan = GetPlanFactory.getPlan(planToChoose);
		if(userChosedPlan == null)
		{
			System.out.println("Entered wrong plan or entered incorrectly");
		}
		else
		{
			userChosedPlan.getRate();
			System.out.println("Bill - "+userChosedPlan.calculateBill(noOfUnitsUsed));
		}
		
		
		sc.close();
		
		System.out.println("--------------------------");
		
		Plan userChosedPlan1 = GetPlanFactory.getPlan("Domestic");
		if(userChosedPlan == null)
		{
			System.out.println("Entered wrong plan or entered incorrectly");
		}
		else
		{
			// 5*10
			userChosedPlan1.getRate();
			System.out.println("Bill - "+userChosedPlan1.calculateBill(noOfUnitsUsed));
			System.out.println();
		}
		
		
		Plan userChosedPlan2 = GetPlanFactory.getPlan("Commercial");
		if(userChosedPlan == null)
		{
			System.out.println("Entered wrong plan or entered incorrectly");
		}
		else
		{
			// 7*10
			userChosedPlan2.getRate();
			System.out.println("Bill - "+userChosedPlan2.calculateBill(noOfUnitsUsed));
			System.out.println();
		}
		
		
		Plan userChosedPlan3 = GetPlanFactory.getPlan("Institutional");
		if(userChosedPlan == null)
		{
			System.out.println("Entered wrong plan or entered incorrectly");
		}
		else
		{
			//9*10
			userChosedPlan3.getRate();
			System.out.println("Bill - "+userChosedPlan3.calculateBill(noOfUnitsUsed));
		
		}
		
	}

}
