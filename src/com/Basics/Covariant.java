package com.Basics;

public class Covariant {

	public static void main(String[] args) {
		Z z=new Y();
		z.m1();
	}

}
class Z
{
	public Animal m1()
	{
		System.out.println("M12-z");
		return new Animal();
		
	}
}
class Y extends Z
{
	@Override
	public Cat m1(){
		System.out.println("M12-Y");
		return new Cat();
		
	}
	
}