package com.techelevator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String integerValue;
		int actualIntegerValue;

		System.out.print("Please enter a number: ");
		integerValue = scanner.nextLine();
		actualIntegerValue = Integer.parseInt(integerValue);

		int[] fibonacciSequence = new int[12];

		int firstFib = 0;
		int secondFib = 1;

			for (int i = 0; i < actualIntegerValue; i = firstFib) {
				int thirdFib = firstFib + secondFib;
				firstFib = secondFib;
				secondFib = thirdFib;
				System.out.print(i + " ");
			}
	}
}
