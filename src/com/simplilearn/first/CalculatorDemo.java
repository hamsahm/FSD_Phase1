package com.simplilearn.first;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("Adding 2 integers :"+calculator.add(2,5));
		System.out.println("Subtracting 2 integers :"+calculator.sub(5,2));
		System.out.println("Multiplying 2 integers :"+calculator.mul(2,5));
		System.out.println("Dividing 2 integers :"+calculator.div(10,2));
		
		System.out.println("=========================================");
		
		System.out.println("Adding 2 float :"+calculator.add(2.8f,5.9f));
		System.out.println("Subtracting 2 float :"+calculator.sub(5.9f,2.8f));
		System.out.println("Multiplying 2 float :"+calculator.mul(2.5f,5.5f));
		System.out.println("Dividing 2 float :"+calculator.div(10.50f,2.50f));
		
		System.out.println("=========================================");
		
		System.out.println("Adding 2 double :"+calculator.add(2.8d,5.9d));
		System.out.println("Subtracting 2 double :"+calculator.sub(5.9d,2.8d));
		System.out.println("Multiplying 2 double :"+calculator.mul(2.5d,5.5d));
		System.out.println("Dividing 2 double :"+calculator.div(10.50d,2.50d));
		
		
	}

}
