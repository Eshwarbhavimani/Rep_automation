package com.constructor;

public class Constructersample {
	
	int a;
	int b;
	public Constructersample(int a){
		System.out.println("i am custructor 1");
		
	}
	public Constructersample(int a,int b){
		System.out.println("i am custructor 2");
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	{
		System.out.println("i am not-static block");	
	}
	public static void main(String args[])
	{
	
	
	
	/*public static void iamstatic(){
		System.out.println(" i am static");
	}
	public void myMethod(){
		System.out.println(" i am method ");
	}
	
	
	/*public static void main(String[] args) {
		/*
		Constructersample c1=new Constructersample(1);
		Constructersample c1=new Constructersample(1,1);*/
		Constructersample c1;
		c1=new Constructersample(1);
		c1=new Constructersample(1, 2);
	}
	
	

}
