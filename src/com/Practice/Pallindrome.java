package com.Practice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = s.nextInt();
		int m=0;
		int num=n;
		while(n>0)
		{
			int d=n%10;
			m=(m*10)+d;
			n/=10;
			
		}
		if(num==m)
			System.out.println("pallindrome");
		else {
			System.out.println("not a pallindrome");
		}

	}

}
