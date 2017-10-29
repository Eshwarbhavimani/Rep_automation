package com.inheritance;

public class Aggregation {
	int id;
	String name;
	Address address;
	
	public Aggregation(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+""+name);
		System.out.println(address.city+""+address.state+""+address.country);
	}

	public static void main(String args[])
	{
		Address address1=new Address("GUB","ka","India");
		Address address2=new Address("GUB","ka","India");
		Aggregation ag1=new Aggregation(111,"esha",address1);
		Aggregation ag2=new Aggregation(112,"esha",address2);
		ag1.display();
		ag2.display();
	}
}
