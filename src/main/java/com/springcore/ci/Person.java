package com.springcore.ci;

public class Person {

	private String Name;
	private int Id;
	private Certi certi;
	
	public Person(String Name, int Id,Certi certi) {
		this.Name=Name;
		this.Id=Id;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return this.Name+":"+this.Id+"{"+this.certi.Name+"}" ;
	}
	
	
	
}
