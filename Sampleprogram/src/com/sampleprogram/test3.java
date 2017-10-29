package com.sampleprogram;

public class test3 
{
	
		public void r1()
		{
		System.out.println("without argument");	
		}
		public void r1(int a, int b)
		{
			System.out.println("with argument");
		}
		public void r1(int a, float b)
		{
			System.out.println("diffrent datatype");
			
		}
		public int r1(int a,int b,int c)
		{
			System.out.println("with return type");
			return 1;
		}
		
		public static void p1()
		{
		System.out.println("static without argument");	
		}
		public static void p1(int a, int b)
		{
			System.out.println("static with argument");
		}
		public static void p1(int a, float b)
		{
			System.out.println("static diffrent datatype");
			
		}
		public static int p1(int a,int b,int c)
		{
			System.out.println("with return type");
			return 1;
		}
		
		public static void main(String args[])
		{
			test3 bb=new test3();
			
			bb.r1(1, 1.0f);
			bb.r1();
			bb.r1(1, 1, 1);
			p1();
			p1(1,2f);
			p1(1,2,3);
			
		}
	
}

