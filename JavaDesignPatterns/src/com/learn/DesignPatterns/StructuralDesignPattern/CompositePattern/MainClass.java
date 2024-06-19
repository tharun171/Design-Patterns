package com.learn.DesignPatterns.StructuralDesignPattern.CompositePattern;

public class MainClass {

	public static void main(String[] args) {
		
		//Composite is a parent class
		//leaf is a last class from where there wont be another classes

		
		//Assume Computer has cabinet and pheripheral devices
		//cabinet - parts inside comp - harddriver, ram, cpu, motherboard
		//pheripheral devices - parts outside comp - mouse, keyboard, monitor
		//pheripheral are leafs and cant be further divided
		
		//These are leafs
		//These cant be further subdivided
		Component hardDrive = new Leaf(4000,"hardDrive");
		Component mouse = new Leaf(500,"mouse");
		Component monitor = new Leaf(8000,"monitor");
		Component ram = new Leaf(300,"ram");
		Component cpu = new Leaf(1000,"cpu");

		//pheripheral
		Composite ph = new Composite("Pheripheral");
		Composite cabinet = new Composite("cabinet");
		Composite motherboard = new Composite("motherboard");
		
		Composite Computer = new Composite("Computer");
	
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hardDrive);
		cabinet.addComponent(motherboard);
		
		Computer.addComponent(ph);
		Computer.addComponent(cabinet);
		Computer.addComponent(motherboard);
		
		
		//only getting ram price
		//ram.showPrice();
		//getting all pheripherals
		//ph.showPrice();
		
		Computer.showPrice();
	}

}
