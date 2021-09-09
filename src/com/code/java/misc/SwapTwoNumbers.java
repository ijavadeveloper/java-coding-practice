package com.code.java.misc;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number num1 : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter number num2 : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Before swap, num1: " +num1+ " , num2: " + num2);

		num2 = num2 + num1;
		num1 = num2 - num1;
		num2 = num2 - num1;
			
		System.out.println("After swap, num1: " +num1+ " , num2: " + num2);
		
		scanner.close();
	}
}
