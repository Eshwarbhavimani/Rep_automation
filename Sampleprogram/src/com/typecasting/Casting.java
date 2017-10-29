package com.typecasting;

public class Casting {
	public Casting() {
		System.out.println("casting 1");
	}
	/*public void iamCasting(){
		System.out.println("myMethod Casting");
		ifLoop(10);
		
	}*/
	
	public static void ifLoop(int j){
		
		int i=10;
		if(i>=j){
			System.out.println("i am i with value of " +j);
			ifLoop(j+1);
		}
	}
	public static void main(String[] args) {
		ifLoop(1);
	}
	
}
