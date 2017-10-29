package com.typecasting;

public class Casting3 {
	
	public static void main(String args[])
	{
		
		Casting c1=null;
		Casting2 c2=null;
		c1=new Casting2();
		c1.iamCasting();
		
		
		c2= (Casting2) c1;
		c2.iamCasting2();
		
		
	}

}
