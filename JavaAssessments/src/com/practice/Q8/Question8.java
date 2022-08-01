package com.practice.Q8;

import java.util.Set;
import java.util.TreeSet;

/*
 * 8. Using TreeSet, make sure to add varied data types to the set including Upper and 
 * Lower case and predict your output.

 */

public class Question8 {

	public static  void main(String[] args) {
		 
		TreeSet ts=new TreeSet();
		try {  
			
		
		ts.add(2);
		ts.add(4);
        ts.add("MUKESH"); 
		ts.add(0.5);
		ts.add('9');
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ts);
		
	}

}
