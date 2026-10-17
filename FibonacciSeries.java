package com.practice.forloop;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter number of next terms yoo want : ");
		int terms = sc.nextInt();
		
		System.out.print(num1+" "+num2+" ");
		
		for(int i = 1 ; i <= terms; i++) {
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			System.out.print(num3 + " ");
			
		}
		
		sc.close();
		
	}
	
}
