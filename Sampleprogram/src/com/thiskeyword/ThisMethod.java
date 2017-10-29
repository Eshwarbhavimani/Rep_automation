package com.thiskeyword;
 class ThisMethod {
	public void A()
	{
		System.out.println("A");
	}
	public void B()
	{
		System.out.println("B");
		this.A();
	}
	/*public void C()
	{
		System.out.println("C");
		this.B();
	}*/
}
	class test{
		public static void main(String args[])
		{
			ThisMethod z=new ThisMethod();
			z.B();
		}
	}


