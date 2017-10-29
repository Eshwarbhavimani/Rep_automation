package com.typecasting;

public class ClassC extends ClassB{
	
	public void mul()
	{
		System.out.println("Multiplication");
	}
public static void main(String args[])
{
	ClassA a=new ClassB();
	a.add();
	ClassB b=new ClassC();
	b.sub();
	ClassC c=(ClassC)b;
	c.mul();
	ClassA f=(ClassA)c;
	f.add();
	ClassC r=(ClassC)f;
	r.mul();
}
}
