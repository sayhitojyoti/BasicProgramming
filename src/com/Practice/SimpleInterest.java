package com.Practice;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter primary value:");
		int p = s.nextInt();
		System.out.println("Enter Time:");
		int t = s.nextInt();
		System.out.println("Enter Interest Rate:");
		int r = s.nextInt();
		int i = (p * t * r) / 100;

	}

}
