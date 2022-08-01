package com.practice.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/*
 * 4. perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections
 */

public class Question4 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(9);
		al.add(23);
		al.add(82);
		ListIterator<Integer> itr=al.listIterator();
        while(itr.hasNext())
        {
        	System.out.print(itr.next()+" ");
        }
		
        System.out.println("adding at specified index");
        al.add(5,8);
		System.out.println(al);
		Collections.sort(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+ " ");
		}
//		while(itr.hasNext())
//		{
//			itr.add(40);
//			itr.next();
//		}
//		System.out.println(al);
		al.set(3, 100);
		System.out.println(al.get(4));
		al.remove(1);
		ArrayList<Integer> a=new ArrayList();
           a.add(1);
		a.add(2);
		a.add(1);
		a.add(3);

		a.add(2);


		int temp;
		for(int i=0;i<a.size();i++)
		{
		temp=a.get(i);

		for(int j=i+1;j<a.size();j++)
		{
		if(temp==a.get(j))
		{
		a.remove(j);
		}
		}
		}
		System.out.println(a);
		



		
		
		
		
	}

}
