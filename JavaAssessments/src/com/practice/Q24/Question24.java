package com.practice.Q24;


/*
 * 24. Using Consumer Interface,print stream of integers ranging from 1 to 10 and make sure 
 * to neglect numbers between 3 and 7.

 */
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.*;


public class Question24 {

	static void filter(ArrayList<Integer> l)
	{
		
		
		List a=l.stream().filter(i->i>7||i<3).collect(Collectors.toList());
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> al=new  ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		Consumer<ArrayList<Integer> >consumer=Question24::filter;
		
		consumer.accept(al);
		

	}

}
