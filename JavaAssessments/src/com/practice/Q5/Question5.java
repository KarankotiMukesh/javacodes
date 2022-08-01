package com.practice.Q5;

/*
 * 5. Design a class OnlyOnce and make sure that only one time it is instantiated. 
 */
public class Question5 {

	public static void main(String[] args) {
	    
		Q5O obj=new Q5O();
		
		int a=21,b=32,c;
		
		
	c=	obj.method(a,b);
		System.out.println(c);

	}

}
