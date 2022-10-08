package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 计算BMI
 */
public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Height (m): ");
		double height = scanner.nextDouble();
		System.out.print("Weight (kg): ");
		double weight = scanner.nextDouble();
		double bmi = weight / Math.pow(height, 2);
		if (bmi < 18.5)
			System.out.print("You are too thin");
		else if (bmi < 25)
			System.out.print("You are normal");
		else if (bmi < 28)
			System.out.print("You are little fat");
		else if (bmi < 32)
			System.out.print("You are fat");
		else
			System.out.print("You are too fat");
	}

}
