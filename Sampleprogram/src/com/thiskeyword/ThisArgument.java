package com.thiskeyword;

public class ThisArgument {
	void m(ThisArgument obj)
	{
		System.out.println("Constructor methos invoked");
	}
	void p()
	{
		m(this);
	}
public static void main(String args[])
{
	ThisArgument ar=new ThisArgument();
	ar.p();
	
}
}
