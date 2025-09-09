package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height");
		System.out.println("Enter width");
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		double area = 0.5 * height * width;
		System.out.println("Area of triangle is :" + area);
		scanner.close();

	}

}
