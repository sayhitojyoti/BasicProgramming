package com.Practice;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(b);
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c);
			a=b;b=c;
			
		}
		
	}

}
