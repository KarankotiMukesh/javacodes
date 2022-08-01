package com.practice.Q13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 13 How to synchronize an ArrayList in java?

 */
public class Question13 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Apple");
		al.add("Banana");
		al.add("Anapple");
		al.add("Orange");
		al.add("Zerra");
		
		
		List<String> l=Collections.synchronizedList(al);
		System.out.println(l);
	}

}
