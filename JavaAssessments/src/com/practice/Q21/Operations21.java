package com.practice.Q21;

/*
 * 21. Class named Operations have final variables like plus,minus,divide and multiply.
	This class has a method named calculate which takes 2 inputs of type double and return
	 value in double
	inside calculate: if plus, inputs are added and returned.(similarly for other methods
	 minus,divide and multiply).
	AssertionError is also thrown when user doesn't perform any of these operations in default.
	In your main method: calculate all 4 results and have these printed in console.
	Make sure to have dynamic inputs.

 */

import java.util.*;

public class Operations21 {
	
	
	Scanner sc=new Scanner(System.in);
	void calculate(double d1,double d2)
	{
		System.out.println("please enter * or + or - or %");
		final String operand=sc.next();
		
		switch(operand)
		{
		case "*":
		{
			System.out.println(d1*d2);
			break;
		}
		case "+":
		{
			System.out.println(d1+d2);
			break;
		}
		case "-":
		{
			System.out.println(d1-d2);
			break;
		}
		case "%":
		{
			System.out.println(d1%d2);
			break;
		}
		
		default:
		{
			System.out.println(d1*d2);
			System.out.println(d1+d2);
			System.out.println(d1-d2);
			System.out.println(d1%d2);
		}
		}
		
		
	}
	

}
