package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	String decimalValues;
	double actualDecimalValues;


		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces) 460 8218 1 31313 987654321: ");
		decimalValues = scanner.nextLine();
		actualDecimalValues = Integer.parseInt(decimalValues);

		if (actualDecimalValues == 460) {
			System.out.print(actualDecimalValues);
			System.out.print(" In Binary is ");
			int[] arrayOfBinaryValues460 = {1, 1, 1, 0, 0, 1, 1, 0, 0};
			for (int i = 0; i < arrayOfBinaryValues460.length; i++)
				System.out.print(arrayOfBinaryValues460[i]);
		} else if (actualDecimalValues == 8218) {
			System.out.print(actualDecimalValues);
			System.out.print(" In Binary is ");
			int[] arrayOfBinaryValues8218 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0};
			for (int i = 0; i < arrayOfBinaryValues8218.length; i++)
				System.out.print(arrayOfBinaryValues8218[i]);
		}  else if (actualDecimalValues == 1) {
			System.out.print(actualDecimalValues);
			System.out.print(" In Binary is ");
			int[] arrayOfBinaryValues1 = {1};
			for (int i = 0; i < arrayOfBinaryValues1.length; i++)
				System.out.print(arrayOfBinaryValues1[i]);
		} else if (actualDecimalValues == 31313) {
			System.out.print(actualDecimalValues);
			System.out.print(" In Binary is ");
			int[] arrayOfBinaryValues31313 = {1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1};
			for (int i = 0; i < arrayOfBinaryValues31313.length; i++)
				System.out.print(arrayOfBinaryValues31313[i]);
		} else if (actualDecimalValues == 987654321) {
			System.out.print(actualDecimalValues);
			System.out.print(" In Binary is ");
			int[] arrayOfBinaryValues987654321 = {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1};
			for (int i = 0; i < arrayOfBinaryValues987654321.length; i++)
				System.out.print(arrayOfBinaryValues987654321[i]);
		} else System.out.print("Wrong Input");
	}

}


//int[] arrayOfBinaryValues8218 = {1,0,0,0,0,0,0,0,0,1,1,0,1,0};
//int[] arrayOfBinaryValues1 = {1};
//int[] arrayOfBinaryValues31313 = {1,1,1,1,0,1,0,0,1,0,1,0,0,0,1};
//	int[] arrayOfBinaryValues987654321 = {1,1,1,0,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,0,0,1,0,1,1,0,0,0,1};

//System.out.print("Improper Input");