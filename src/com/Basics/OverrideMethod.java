package com.Basics;

public class OverrideMethod {

	public static void main(String[] args) {
		phone s=new phone();
		s.call();
	}
 
}
class phone{
	void call()
	{
		System.out.println("Normal call");
	}
}
class smartphone extends phone{
	@Override
	void call()
	{
		System.out.println("Hd voice call connected");
	}
	
}

