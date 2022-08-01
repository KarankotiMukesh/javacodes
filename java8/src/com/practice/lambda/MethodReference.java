package com.practice.lambda;

interface mass{
	void m();
}


public class MethodReference {

	public void m()
	{
		System.out.println(" this is reference of method");
	}
	
	public static void main(Str1[] args) {
		MethodReference m1=new MethodReference();
		
		mass m2=m1::m;
		m2.m();
		
		
	}

}
