package com.constructorchaining;

public class FinalClass {

	final int g=10;
	final void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);	
	}
	final void add(int a,float b)
	{
		int g=20;
		float d=a-b;
		System.out.println(d);
	}

	public static void main(String args[])
	{
		FinalClass f=new FinalClass();
		f.add(5, 7);
		f.add(10, 5.5f);
	}
}
