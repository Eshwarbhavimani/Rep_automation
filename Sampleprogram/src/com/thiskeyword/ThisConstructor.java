package com.thiskeyword;

public class ThisConstructor {
	int id;
	String name;
	String city;
	ThisConstructor(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	ThisConstructor(int id, String name, String city)
	{
		this(id,name);
		this.city=city;
		
	}
	void display()
	{
		System.out.println(id+""+name+""+city);
	}
	public static void main(String args[])
	{
		ThisConstructor aa= new ThisConstructor(111,"Eshwar");
		ThisConstructor ab= new ThisConstructor(112,"Esha","Gub");
		aa.display();
		ab.display();
		
	}

}
