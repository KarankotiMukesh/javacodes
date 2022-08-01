package com.practice.Q25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;
/*
 * 25. Using Consumer Interface,print stream of integers ranging from 1 to 10 and double these numbers in your output.

 */

public class Question25 {
	
	static void increasing(ArrayList<Integer> al)
	{
		List<Integer> a=al.stream().map(i->(i*2)).collect(Collectors.toList());
		System.out.println(a);
	}
	

	public static void main(String[] args) {

		ArrayList<Integer>a=new ArrayList<Integer>();	
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		
		
		Consumer<ArrayList<Integer>> consumer=Question25::increasing;
		
		consumer.accept(a);
		
	}

}
