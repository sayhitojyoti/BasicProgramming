package com.Practice;

import java.util.Scanner;

public class SwapUsing3rdVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int a = s.nextInt();
		System.out.println("Enter first Number:");
		int b = s.nextInt();
		System.out.println("Before Swapping:"+a);
		System.out.println("Before Swapping:"+b);
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("===============");
		System.out.println("After Swapping:"+a);
		System.out.println("After Swapping:"+b);
		

	}

}
