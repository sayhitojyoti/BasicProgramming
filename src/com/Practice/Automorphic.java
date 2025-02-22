package com.Practice;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n = s.nextInt();
		int sq = n * n;
		boolean flag = true;
		while (n > 0) {
			if (n % 10 != sq % 10) {
				flag = false;
				break;
				

			}
			n/=10;
			sq/=10;
		}
		if(flag==true)
		{
			System.out.println("Automorphic");
		}
		else 
			{
				System.out.println("Not Atomorphic");
			}
		

	}

}
