package com.Basics;

public class test1 {

	public static void main(String[] args) {
		D d=new D();
		d.m1();

	}

}
class C
{
	protected  void m1()
	{
		System.out.println("M1-A");
	}
}
class D extends C
{
	@Override
		public void m1()
		{
			System.out.println("M1-B");
		}
	}

