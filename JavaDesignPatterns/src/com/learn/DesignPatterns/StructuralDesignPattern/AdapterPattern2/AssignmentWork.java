package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern2;

public class AssignmentWork {
	
	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignment(String str)
	{
		//we dont have object created for pen to write and
		//pen is an interface, so cannot be instantiated.
		pen.write(str);
	}
	
	
}
