package com.practice.Q9;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;


/*
 * 9. Perform analysis on ListIterator and Iterator and provide your handson examples
         on each analysis.
 */


public class Question9 {

	public static void main(String[] args) {

		  ArrayList<Integer> al=new ArrayList<Integer>();
		  al.add(2);
		  al.add(5); 
		  al.add(7);
		  al.add(23);
		  al.add(43);
		  
		  ListIterator<Integer> itr=al.listIterator();
	         java.util.Iterator<Integer> itr1=  al.iterator();
		  System.out.println("this is ListIterator with forward Direction");
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  System.out.println();
		  System.out.println("this is ListIterator with BackWard Direction");
		  while(itr.hasPrevious())
		  {
			  System.out.println(itr.previous());
		  }
		  System.out.println();
		  
		  System.out.println("this is a Iterator");
		  while(itr1.hasNext())
		  {
			  System.out.println(itr1.next());
		  }
	}

}
