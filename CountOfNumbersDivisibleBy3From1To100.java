package com.practice.forloop;

public class CountOfNumbersDivisibleBy3From1To100 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {

				count++;

			}

		}

		System.out.println("Count Of Numbers whose Divisible By 3 Between 1 To 100 = " + count);

	}

}
