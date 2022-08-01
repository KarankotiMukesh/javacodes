package com.practice.Q20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



/*
 * 20. Methods of Iterator:hasNext(),next(),remove()
	Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex()
	,previous(),previousIndex(),remove(),set(E e)	 
 */

public class Question20 {

	public static void main(String[] args) {
		
   ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(2);
		al.add(34);
		al.add(43);
		al.add(23);
		al.add(22);
		al.add(20);
	try {
		
	
		Iterator<Integer> itr=al.iterator();
		ListIterator<Integer> itr1=al.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(itr.hasNext())
		{
			itr.remove();
		}
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
//		while(itr1.hasNext())
//		{
//			System.out.println(itr1.nextIndex());
//			System.out.println(itr1.previousIndex());
//			al.remove(itr1);
//		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
