package com.practice.forloop;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num = 4 , fact = 1;
		
		for(int i = 1; i <= num; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println("Factorial Of "+num+ " = " +fact);
		
	}
	
}
