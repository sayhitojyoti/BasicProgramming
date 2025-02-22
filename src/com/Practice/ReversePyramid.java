package com.Practice;

public class ReversePyramid {

	public static void main(String[] args) {
		int n=5;
		int sp=0;
		int st=(n*2)-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
				
			{
				System.out.print("*");
			}
			st-=2;
			sp++;
			System.out.println();
			
		}

	}

}
