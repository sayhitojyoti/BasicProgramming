package com.Practice;

public class NumChar {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int letter=1;
		char c='A';
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=letter;k++)
			{
				 if(k==1||k==letter||i==n)
				 {
					 System.out.print(c);
					 c++;
				 }
				 else {
					 {
						 System.out.print(num);
						 num++;
					 }
					
					 
				}
				 
			}
			 System.out.println();
			 sp--;
			 letter+=2;
			 
		}

	}

}
