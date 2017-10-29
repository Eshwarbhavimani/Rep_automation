package com.thiskeyword;

public class ThisKeyword {
	int id;
	String name;
	String location;
	ThisKeyword(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println(id+""+name+""+location);
	}
	public static void main(String args[])
	{
		ThisKeyword t=new ThisKeyword(111,"Eshwar","gub");
		t.display();
		
	}

}
