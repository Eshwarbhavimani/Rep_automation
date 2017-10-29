package com.abtrsaction;

public class InterfaceTest implements SampleInterface{
	public void add()
	{
		System.out.println("Addition");
	}
	public void add1()
	{
		System.out.println("Addition2");
	}
	public static void main(String args[])
	{
		InterfaceTest t=new InterfaceTest();
		t.add();
		t.add1();
	}

}
