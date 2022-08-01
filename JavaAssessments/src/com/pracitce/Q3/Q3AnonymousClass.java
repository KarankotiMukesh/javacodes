package com.pracitce.Q3;

/*
 * 3. With help of an anonymous inner class, implement any abstract method of the interface. 
 * Observe on working of anonymous Inner class here.

 */


abstract class A{
	
	abstract int method(int a,int b);
}


public class Q3AnonymousClass {

	public static void main(String[] args) {
		
		A obj=new A() {
			
			int  method(int a,int b)
			{
				return a*b;
			}
			
		};
		
		int ans=obj.method(2,7);
		System.out.println(ans);
        
	}

}
