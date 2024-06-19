package com.learn.DesignPatterns.CreationalDesignPatterns.BuilderPattern2;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Builder Pattern - Creational Builder Pattern
		
		 Home house = new Home.HouseBuilder()
                 .setFoundation("Concrete, brick, and stone")
                 .setStructure("Wood and brick")
                 .setRoof("Concrete and reinforced steel")
                 .setInterior("Modern")
                 .build();

		 System.out.println(house);
	}

}
