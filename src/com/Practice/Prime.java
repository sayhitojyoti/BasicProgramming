package com.Practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean flag=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				System.out.println("Not A Prime");
				break;
			}
		}
		if(flag)
			System.out.println("Prime");

	}

}
