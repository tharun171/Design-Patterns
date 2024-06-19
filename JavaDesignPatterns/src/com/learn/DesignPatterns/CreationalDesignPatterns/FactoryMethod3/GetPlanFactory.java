package com.learn.DesignPatterns.CreationalDesignPatterns.FactoryMethod3;

public class GetPlanFactory {

	public static Plan getPlan(String plan)
	{
		if(plan.equalsIgnoreCase("commercial"))
		{
			return new CommercialPlan();
		}
		else if(plan.equalsIgnoreCase("Domestic"))
		{
			return new DomesticPlan();
		}
		else if(plan.equalsIgnoreCase("Institutional"))
		{
			return new InstitutionalPlan();
		}
		else
		{
			return null;
		}
	}
}
