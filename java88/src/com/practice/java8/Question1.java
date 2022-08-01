package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Ques 1. What are the Terminal operations? give an example for 1.collect() 2.reduce() 3. anyMatch() 
 * , noneMatch() , allMatch() 4. forEach() 5.forEachOrdered()
 */
public class Question1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(45);
		al.add(43);
		al.add(49);
		al.add(40);
		
		List<Integer> a=al.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println(a);
		int result=al.stream().reduce(0,(i,sum)->i+sum);
		System.out.println(result);
		boolean b=al.parallelStream().anyMatch(n->n==4);
		System.out.println(b);
		boolean non=al.parallelStream().noneMatch(n->n==3);
		System.out.println(non);
		boolean all=al.parallelStream().allMatch(n->n>0);
		System.out.println(all);
		al.forEach(u->System.out.print(u));
		System.out.println();
		al.stream().forEachOrdered(k->System.out.print(k));
		
	}

}
