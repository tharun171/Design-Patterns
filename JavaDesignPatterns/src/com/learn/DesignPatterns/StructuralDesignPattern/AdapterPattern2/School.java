package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern2;

public class School {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		//Adapter pattern - Structural Design Pattern
		
		//Assume school gives AssignmentWork
		//for writing assignment, we need a Pen
		
		
		PenAdapter pa = new PenAdapter();
		//or
		Pen pa2 = new PenAdapter();
		
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pa2);
		aw.writeAssignment("I am tried to write an assignment");

	}

}
