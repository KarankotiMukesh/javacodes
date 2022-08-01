package com.practice.Prime1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class PrimeNumbers {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>a=new  ArrayList<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(2);
		al.add(7);
		al.add(22);
		al.add(92);
		al.add(81);

	
		
		
		
		a=(ArrayList<Integer>) al.stream().filter(i->i>0).collect(Collectors.toList());
			
			
	
		
		
		
	}

}
