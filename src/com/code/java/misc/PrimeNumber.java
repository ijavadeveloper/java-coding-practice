package com.code.java.misc;

import java.util.Scanner;

/**
 * 
 * This program find a number is Prime or not
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		boolean isPrime = isPrimeNumber(num);
		
		if(isPrime) {
			System.out.println( num + " is a Prime Number");
		}else {
			System.out.println( num + " is not a Prime Number");
		}
		
		scanner.close();
		
	}

	/**
	 * @param num
	 * finds given num is prime or not
	 */
	private static boolean isPrimeNumber(int num) {

		if(num == 0 || num == 1) return false;
		
		if(num == 2) return false;
		
		for(int i=2; i<=num/2; i++ ) {
			if(num%i == 0) return false;
		}
		return true;
	}

}
