package com.systemprintln;

import java.io.ObjectInputStream.GetField;

public class printclass {
	int id;
	String name;
	int age;
	printclass(int i,String n)
	{
		id=i;
		name=n;
	}
	printclass(int i,String n,int a)
	{
		age=a;
	}
	void display()
	{

		System.out.println("done");
		
	}
	void fact(int n)
	{
		int fact=1;
		int i;
		for(i=1;i<=n;i++)
			fact=fact*i;
			System.out.println("factorial:"+fact);
	}
public static void main(String args[])
{
	new printclass().add(10, 20);
	new printclass().display();
	new printclass().fact(5);
	//p.add(10, 20);
	//p.display();
	
}
}
