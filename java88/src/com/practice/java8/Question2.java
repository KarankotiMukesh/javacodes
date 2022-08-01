package com.practice.java8;
import java.util.*;
import java.util.stream.Collectors;
/*
 * Ques 2. What are the most commonly used Intermediate operations? give an example for 1.distinct() 
 * 2.limit() 3.skip() 4. peek() 5.flatMap()

 */
public class Question2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(7);
		al.add(4);
		al.add(7);
		al.add(8);
		al.add(7);
		ArrayList<Integer> a=(ArrayList<Integer>) al.parallelStream().distinct().collect(Collectors.toList());
		System.out.println(a);
		ArrayList<Integer> l=(ArrayList<Integer>)al.parallelStream().limit(2).collect(Collectors.toList());
		System.out.println(l);
		ArrayList<Integer> a1=(ArrayList<Integer>)al.stream().skip(4).collect(Collectors.toList());
		System.out.println(a1);
		ArrayList<Integer> a2=(ArrayList<Integer>)al.stream().peek(i->i=i+2).collect(Collectors.toList());
		System.out.println(a2);
	}

}
