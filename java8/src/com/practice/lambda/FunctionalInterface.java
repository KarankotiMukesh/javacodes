package com.practice.lambda;

interface A{
	default void m() {
		System.out.println("this is default message");
	}
}
interface B extends A{
	
	void m1();
}
 class FunctionalInterface implements B {
	 
	 public void m1()
	 {
		 System.out.println("this is functional interface");
	 }
	public static void main(Str1[] args) {
		
		FunctionalInterface obj=new FunctionalInterface();
		
           obj.m1();
           obj.m();
           
	}

}
