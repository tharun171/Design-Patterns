package com.learn.DesignPatterns.StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	
	String name;
	
	public Composite(String name)
	{
		super();
		this.name = name;
	}
	
	//one composite can have composites or leafs
	List<Component> components = new ArrayList<Component>();
	
	
	public void addComponent(Component comp)
	{
		components.add(comp);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component comp:components)
		{
			comp.showPrice();
		}
	}

}
