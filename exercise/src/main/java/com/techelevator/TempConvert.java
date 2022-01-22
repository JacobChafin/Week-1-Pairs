package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		String celsiusFahrenheit;
		String temperature;
		double actualTemperature;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		temperature = scanner.nextLine();
		actualTemperature = Double.parseDouble(temperature);

			System.out.print("Please enter if the temperature is in (C) for celsius, or (F) for fahrenheit? ");
			celsiusFahrenheit = scanner.nextLine();

		if (celsiusFahrenheit.equalsIgnoreCase("F") ) {
			actualTemperature = ((actualTemperature - 32) / 1.8);
			System.out.print(actualTemperature);
		} else if (celsiusFahrenheit.equalsIgnoreCase("C")) {
			actualTemperature = ((actualTemperature * 1.8) + 32);
			System.out.print(actualTemperature);
		} else {
			System.out.print("Improper Input");
		}
	}
}
