package com.practice.Q22;

/*
 * 22. Provide an interface Company with 
	default method of return type double calculating the profit(CP-SP)
	static method of return type String which takes (double) input from previous method 
	and returns company name.
	Abstract method String getCompDetails(double profit,String name);=>Needs 
	to be implemented using Lambda expression.
 */

interface Company{
	default double profit(double sp,double cp)
	{
		double p=sp-cp;
		
		return p;
	}
}
 interface A extends Company{
	
	public static String add(double p)
	{
		String s="techouts"+p;
		
		
		return s;
	}
	
	
}

interface A1 extends Company,A
{
	public abstract String getCompanydetails(double profit ,String n);
}

public class Question22 {

	public static void main(String[] args) {
		
     
		A1 obj=(p,s)->
		{
			return p+" "+s;
		};
	
		double d3=obj.profit(12.0,6.0);
		String s3=A.add(d3);
		System.out.println(obj.getCompanydetails(d3,"techouts"));
		
	}

}
