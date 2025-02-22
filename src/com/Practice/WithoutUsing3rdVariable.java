package com.Practice;

import java.util.Scanner;

public class WithoutUsing3rdVariable {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first Number:");
			int a = s.nextInt();
			System.out.println("Enter first Number:");
			int b = s.nextInt();
			System.out.println("Before Swapping:"+a);
			System.out.println("Before Swapping:"+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("===============");
			System.out.println("After Swapping:"+a);
			System.out.println("After Swapping:"+b);

	}

}
