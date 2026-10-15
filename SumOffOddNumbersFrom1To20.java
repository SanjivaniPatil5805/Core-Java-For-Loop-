package com.practice.forloop;

public class SumOffOddNumbersFrom1To20 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 1) {

				sum = sum + i;

			}

		}

		System.out.println("Sum Of Odd Numbers From 1 To 20 = " + sum);

	}

}
