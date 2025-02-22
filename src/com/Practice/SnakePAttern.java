package com.Practice;

public class SnakePAttern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int x = i - 1;
				x = (x * (x + 1)) / 2;
				x = x + 1;
				for (int j = 1; j <= i; j++) {
					System.out.print(x +"\t");
					x++;
				}
			} else {
				{
					int x = (i * (i + 1)) / 2;
					for (int j = 1; j <= i; j++) {
						System.out.print(x );
						x--;
					}
				}
			}
			System.out.println();
		}
		

	}
	

}
