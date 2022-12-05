package com.greatlearning.main;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		//System.out.println("Rest of the code");
		//int divideByZero = 5/0;
		System.out.println("Rest of the code");
		try {
			int divideByZero = 5/0;
			System.out.println("Rest of the code");
		}catch(ArithmeticException e) {
			System.out.println("ArithMetic Exception" +e.getMessage());
			
		}
		
		System.out.println("Rest of the code");
		
		//other Business logics here
		
	}

}
