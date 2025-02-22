package com.Practice;

import java.util.Scanner;

public class Book {
	String name;
	String author;
	double price;

	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;

	}

	public static Book createBook() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name,author,price");
		String name = s.next();
		String author = s.next();
		double price = s.nextDouble();
		return new Book(name, author, price);
	}

	public void display() {
		System.out.println(name);
		System.out.println(author);
		System.out.println(price);
	}

}