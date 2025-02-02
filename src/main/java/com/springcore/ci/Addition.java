package com.springcore.ci;

public class Addition {

	private int A;
	private int B;
	
	public Addition(int A,int B) {
		this.A=A;
		this.B=B;
		System.out.println("Constructor - int ,int");
	}
	
	public Addition(double A,double B) {
		this.A=(int)A;
		this.B=(int)B;
		System.out.println("Constructor - double ,double");
	}
	
	@Override
	public String toString() {
		return "Addition [A=" + A + ", B=" + B + "]";
	}

	public void dosum() {
		System.out.println("Sum of number-"+(this.A+this.B));
	}

	
	
	
}
