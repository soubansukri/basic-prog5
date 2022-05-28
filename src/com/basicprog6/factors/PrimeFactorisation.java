package com.basicprog6.factors;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number to check its prime factors::");
	      int number = scanner.nextInt();
	     
	     
	      for(int i = 2; i<= number; i++) {
	         while(number%i == 0) {
	            System.out.println(i);
	            number = number/i;
	            
	         }
	      }
	     
	      

	}

}
