package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		String celsiusFahrenheit;
		String temperature;
		double actualTemperature;
		boolean actualCelsiusFahrenheit;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		temperature = scanner.nextLine();
		actualTemperature = Double.parseDouble(temperature);

		do {
			System.out.print("Please enter temperature in (C)elsius, or (F)ahrenheit? ");
			celsiusFahrenheit = scanner.nextLine();
//			actualCelsiusFahrenheit = Boolean.parseBoolean(celsiusFahrenheit);
		} while ((celsiusFahrenheit == "C") || (celsiusFahrenheit == "F"));

		if (celsiusFahrenheit == "F") {
			actualTemperature = ((actualTemperature - 32) / 1.8);
		} else {
			actualTemperature = ((actualTemperature * 1.8) + 32);
		}







//		System.out.print(celsiusFahrenheit);

		System.out.print(actualTemperature);
	}

}
