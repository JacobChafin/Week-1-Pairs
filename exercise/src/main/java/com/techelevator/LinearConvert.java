package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String length;
		double actualLength;
		String feetMeters;

		System.out.print("Please put length: ");
		length = scanner.nextLine();
		actualLength = Double.parseDouble(length);

		System.out.print("Please put if the length is in (F) for feet or (M) for meters: ");
		feetMeters = scanner.nextLine();

		if (feetMeters.equalsIgnoreCase("F")) {
			actualLength = (actualLength * 0.3048);
			System.out.print(actualLength);
		} else if
		(feetMeters.equalsIgnoreCase("M")) {
			actualLength = (actualLength * 3.2808399);
			System.out.print(actualLength);
		} else {
			System.out.print("Wrong input");
		}
	}

}
