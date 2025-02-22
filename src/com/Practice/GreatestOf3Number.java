package com.Practice;

import java.util.Scanner;

public class GreatestOf3Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int a=s.nextInt();
		System.out.println("Enter the 2nd Number:");
		int b=s.nextInt();
		System.out.println("Enter the 3rd Number:");
		int c=s.nextInt();
		int res=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest integer is:"+res);
		
		
		

	}

}
