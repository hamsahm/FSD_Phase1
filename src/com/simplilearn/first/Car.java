package com.simplilearn.first;

public class Car {
	
	// properties: member variables
	private int modelNumber;
	private String brandName;
	private String color;
	
	//methods: member function
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void start() {
		System.out.println("Car started !!");
	}
	
	public void stop() {
		System.out.println("Car stopped !!");
	}


}
