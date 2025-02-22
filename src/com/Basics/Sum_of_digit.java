package com.Basics;

public class Sum_of_digit 
{
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return (n%10+sum(n/10));
	}
	public static void main(String[]args)
	{
		int num=231456;
		int result=sum(num);
		System.out.print("Sum of Number is:"+result);
	}

}
