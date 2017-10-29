package com.typecasting;

public class CoumpterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c=new Dell();
		c.ram();
		c.cpu();
		Dell d1=new Toshiba();
		d1.ram();
		d1.cpu();
		Toshiba t=(Toshiba)d1;
		t.ram();
		t.cpu();

	}

}
