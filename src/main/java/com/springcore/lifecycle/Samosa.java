package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init() {
		System.out.println("Init method");
	}
	
	public void destroy() {
		System.out.println("Destroy Method");
	}
	
}
