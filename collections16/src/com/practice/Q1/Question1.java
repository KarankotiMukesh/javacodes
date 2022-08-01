package com.practice.Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Ques1. Wite a Java program to create read only data using List, Set and Map in example
 */

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(32);
		al.add(29);

		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(34);
		hs.add(3);
		hs.add(345);
		hs.add(344);
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(101,"mukesh");
		hm.put(104,"mukki");
		hm.put(1023,"pavan");
		hm.put(109,"mickey");
		
	}

}
