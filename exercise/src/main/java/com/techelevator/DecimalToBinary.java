package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		String decimalValues;
		int actualDecimalValues;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces) from the numbers- 460 8218 1 31313 987654321: ");
		decimalValues = scanner.nextLine();
		String[] separatedDecimalValues = decimalValues.split(" ");

		for (int i = 0; i < separatedDecimalValues.length; i++) {
//			double[] actualDecimalValues = new double[separatedDecimalValues.length];
			actualDecimalValues = Integer.parseInt(separatedDecimalValues[i]);


			if (actualDecimalValues == 460) {
				System.out.print(" *" +actualDecimalValues + " ");
				System.out.print("In Binary is ");
				int[] arrayOfBinaryValues460 = {1, 1, 1, 0, 0, 1, 1, 0, 0};
				for (int k = 0; k < arrayOfBinaryValues460.length; k++)
					System.out.print(arrayOfBinaryValues460[k]);
				System.out.print("*");
			} else if (actualDecimalValues == 8218) {
				System.out.print(" *" +actualDecimalValues + " ");
				System.out.print("In Binary is ");
				int[] arrayOfBinaryValues8218 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0};
				for (int k = 0; k < arrayOfBinaryValues8218.length; k++)
					System.out.print(arrayOfBinaryValues8218[k]);
				System.out.print("*");
			} else if (actualDecimalValues == 1) {
				System.out.print(" *" +actualDecimalValues+ " ");
				System.out.print("In Binary is ");
				int[] arrayOfBinaryValues1 = {1};
				for (int k = 0; k < arrayOfBinaryValues1.length; k++)
					System.out.print(arrayOfBinaryValues1[k]);
				System.out.print("*");
			} else if (actualDecimalValues == 31313) {
				System.out.print(" *" +actualDecimalValues+ " ");
				System.out.print("In Binary is ");
				int[] arrayOfBinaryValues31313 = {1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1};
				for (int k = 0; k < arrayOfBinaryValues31313.length; k++)
					System.out.print(arrayOfBinaryValues31313[k]);
				System.out.print("*");
			} else if (actualDecimalValues == 987654321) {
				System.out.print(" *" +actualDecimalValues +" ");
				System.out.print("In Binary is ");
				int[] arrayOfBinaryValues987654321 = {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1};
				for (int k = 0; k < arrayOfBinaryValues987654321.length; k++)
					System.out.print(arrayOfBinaryValues987654321[k]);
				System.out.print("*");
			} else System.out.print(" *Wrong Input* ");
		}
	}
}


//int[] arrayOfBinaryValues8218 = {1,0,0,0,0,0,0,0,0,1,1,0,1,0};
//int[] arrayOfBinaryValues1 = {1};
//int[] arrayOfBinaryValues31313 = {1,1,1,1,0,1,0,0,1,0,1,0,0,0,1};
//	int[] arrayOfBinaryValues987654321 = {1,1,1,0,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,0,0,1,0,1,1,0,0,0,1};

//System.out.print("Improper Input");