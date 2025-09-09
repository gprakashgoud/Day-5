package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 50000;
		int pin=1234;
		int enteredpin;
		System.out.println("Enter your pin");
		enteredpin=scanner.nextInt();
		if(enteredpin !=pin) {
			System.out.println("Incorrect pin. Existing");
			return;
		}
		int choice;
		do {
			System.out.println("");
			System.out.println("=========================");
			System.out.println("=======ATM MENU========================");
			System.out.println("=========1.check Balance======================");
			System.out.println("==========2.Deposit=====================");
			System.out.println("===========3.Withdraw====================");
			System.out.println("============4.Exit===================");
			System.out.println("");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your Balance is "+balance);
				break;
			case 2:
				System.out.println("Enter your Deposit amount :");
				double depositAmount=scanner.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please enter multiples of 100");
				}else {
					if(depositAmount<500) {
						System.out.println("Please enter more than 500 rupees");
					}else {
						balance-=depositAmount;
						System.out.println("Deposit :" +depositAmount+"Succesfully... updated balance is :"+balance);
					}
				}
				break;
			case 3:
				System.out.println("Enter your withdrawl amount");
				double withdrawAmount=scanner.nextDouble();
				if(withdrawAmount%100!=0) {
					System.out.println("Please enter multiples of 100");
				}else {
					if(withdrawAmount<500) {
						System.out.println("Please enter more than 500 rupees");
					}else {
						if(withdrawAmount>balance) {
							System.out.println("Insufficient balance");
						}else {
							balance-=withdrawAmount;
							System.out.println("withdraw : " +withdrawAmount+ "Succesfully... updated balance is : "+balance);
						}
					}
				}
				break;
			case 4:
				System.out.println("Exit... Thankyou for using ATM");
				break;
				default:
					System.out.println("Invalid choice.."+"please chose a valid choice");
					break;
					
			}
			}
		while (choice!=4);
		scanner.close();
			
		

	}

}
