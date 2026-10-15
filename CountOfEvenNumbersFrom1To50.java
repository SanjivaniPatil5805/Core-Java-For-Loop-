package com.practice.forloop;

public class CountOfEvenNumbersFrom1To50 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<= 50; i++) {
			
			if(i % 2 == 0) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Count Of Even Numbers Between 1 To 50 = "+count);
		
	}
	
}
