package com.basicprog6.harmonicnum;
import java.util.Scanner;


public class HarmonicNumber {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter The Number: ");

		int num = scanner.nextInt();
		double result = 0.0;

		System.out.println("The harmonic number is: ");

		for (int i = 1; i <=num; i++) {

			result = result +(double) 1 / i;

			System.out.print(result + ", ");
		}
	}
}
