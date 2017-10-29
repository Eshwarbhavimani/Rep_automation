package com.constructorchaining;

public class Simple extends Abstarctclass {
	Simple()
	{
		super();
	}
	public void myMethod()
	{
		System.out.println("Abtract method calling");
	}
	public void display()
	{
		super.display();
		System.out.println("Concret method");
	}
	
	public static void main(String args[])
	{
		Simple s=new Simple();
		s.myMethod();
		s.display();
	}

}
