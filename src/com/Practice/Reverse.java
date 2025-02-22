package com.Practice;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int m = 0; // Variable to store the reversed number
        int num = n; // Storing the original number for reference

        while (n > 0) {
            int d = n % 10; // Extract the last digit
            m = (m * 10) + d; // Add it to the reversed number
            n /= 10; // Remove the last digit from the number
        }

        System.out.println("Original number is: " + num);
        System.out.println("Reversed number is: " + m);
    }
}
