package com.Basics;

public class MethodOVerriding {

	public static void main(String[] args) {
		A a=new B();
		a.m1();	
	}
}
class A
{
	int i=10;
	void m1(){
		System.out.println("M1-A");
	}
}
class B extends A
{
	int i=20;
	void m1()
	{
		System.out.println(super.i);
		System.out.println("M1-B");
	}
}