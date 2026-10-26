package com.practice.forloop;
import java.util.Scanner;

public class GCDofNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two numbers to find GCD :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n;
		int gcd = 1;
		
		if(a > b) {
			
			n = b;
			
		} else {
			
			n = a;
			
		} 
		
		for(int i = 1; i <= n; i++) {
			
			if(a % i == 0 && b % i == 0) {
				
				gcd = i;
				
			}
				
		}
		
		System.out.println("GCD of "+ a + " and "+ b + " = "+gcd);
		
		sc.close();
		
	}
	
	
}
