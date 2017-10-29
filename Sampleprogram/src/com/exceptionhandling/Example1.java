package com.exceptionhandling;

public class Example1 {
	
	public static void main(String args[])
	{
		int a;
		try{
			
		a=50/0;
		}
		catch(Exception e)
		{
			System.out.println("Common task1");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Airthmetic Exception");
		}*/
		finally
		{
		System.out.println("finally the flow continues...!!");
		}
		
	}
	}


