package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius=scanner.nextInt();
		double area=3.14*radius*radius;
		System.out.println("Area of circle is :"+area);
		scanner.close();

	}

}
