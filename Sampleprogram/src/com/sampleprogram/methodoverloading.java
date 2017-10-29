package com.sampleprogram;

public class methodoverloading {

	public void switch1()
	{
	System.out.println("not switech");
	}
	public void switch1(String a)
	{
		System.out.println("only bulb on");
	}
	public void switch1(String a, String b)
	{
		System.out.println("both tv and bulb on");
	
	}
	public static String switch1(String a, String b, String c)
	{
		System.out.println("tv,fan, and bulb on");
		return "eshwar";
	}
	public static void main(String args[])
	{
		methodoverloading mo=new methodoverloading();
	
		mo.switch1();
		mo.switch1(null);
		mo.switch1(null, null);
		switch1(null,null,null);
		
		
		
		

		
		
	}
}
