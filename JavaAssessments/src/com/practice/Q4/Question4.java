package com.practice.Q4;


/*
 * 4. hashCode(), equals(), toString() and .equals(), .parseInt()=>Perform programs
 */
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=" ";
		for(int i=0;i<n;i++)
		{
			
			s=s+ Integer.toString(i);
			
		}
		String b="32";
		System.out.println(s);
		System.out.println(s.hashCode());
		boolean t=s.equals(s.hashCode());
		System.out.println(t);
		
		int a=Integer.parseInt(b);
    
		System.out.println(a);
		
		
	}

}
