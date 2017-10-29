package com.methodoverriding;

public class methodoverriding2 extends methodoverriding
{
	
	public void a(int a, int b)
	{
		System.out.println("test 3");
		super.a(1, 2);
	}
	public void b(int a,int b)
	{
		super.b(1, 2);
		System.out.println("test 4");
	}

}
