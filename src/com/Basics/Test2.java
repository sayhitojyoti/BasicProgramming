package com.Basics;

public class Test2 {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.makesound();

	}

}
class Animal
{
	void makesound()
	{
		
	}
}
class Dog extends Animal
{
	@Override
		public void makesound()
		{
			System.out.println("Bow bow");
		}
}
class Babydog extends Dog
{
    @Override
    public void makesound(){
    	System.out.println("weepeing");	
}
}
class Cat extends Animal
{
	@Override
	void makesound() {
		System.out.println("Meowwwwwwww");
	}
	
}
