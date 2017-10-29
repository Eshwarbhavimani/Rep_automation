package com.cloneable;

public class Student implements Cloneable {

	int roolno;
	String name;
	Student(int roolno, String name)
	{
		this.roolno=roolno;
		this.name=name;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[])
	{
		try{
			Student s1=new Student(11,"Eshwar");
			Student s2=(Student)s1.clone();
			
			System.out.println(s1.roolno+ " "+s1.name);
			System.out.println((s2.roolno+" "+s2.name));
		}catch(CloneNotSupportedException c)
		{
	}
}
}