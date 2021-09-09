package com.code.java.misc;

import java.util.Scanner;

/** 
 * This program finds factorial of given integer
 */

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int fact= findFactorial(num);
		
		System.out.println("Factorial of num: " + num + " is : " + fact);
		
		scanner.close();
	}

	/** 
	 * @param num 
	 * Finds Factorial for given input num
	 */
	private static int findFactorial(int num) {
		int fact = 1;
		
		for(int i=2; i<=num; i++) {
			fact *=i;
		}
		return fact;
	}
}
