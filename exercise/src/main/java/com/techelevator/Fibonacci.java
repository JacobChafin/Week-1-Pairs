package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String integerValue;
		int actualIntegerValue;
		int fibPrimary;
		int fibSecondary;

		System.out.print("Please enter a number: ");
		integerValue = scanner.nextLine();
		actualIntegerValue = Integer.parseInt(integerValue);
		int[] fibonacciSequence = new int[];

		if actualIntegerValue <= fibonacciSequence[fibonacciSequence.length] {

			for (int i = 2; i < fibonacciSequence.length; i++) {
				int count1 = (i - 1);
				int count2 = (i - 2);
				fibonacciSequence[0] = 0;
				fibonacciSequence[1] = 1;
				fibonacciSequence[i] = fibonacciSequence[count1] + fibonacciSequence[count2];
			}
		}
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,