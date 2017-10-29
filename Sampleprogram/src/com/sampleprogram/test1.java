package com.sampleprogram;

public class test1 {
	
	public static void main(String[] args) {
		test1 t1=null;
		t1=new test1();
		t1.e1();
		test1.e1();
		t1.e1(1, 1.1);
		t1.e1(1, 1);
	}
	
	public static void e1(){
		
	}
	public void e1(int a){
		
	}
	
	public void e1(int a,double b){
		
	}
	
	public void e1(int a,int b,int c){
		
	}
	
	public int e1(float a){
		
		return 1;
	}
	
}