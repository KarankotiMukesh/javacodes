package com.practice.Q11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 11 Write a program to synchronize a HashMap in java?

 */

public class Question11 {

	public static void main(String[] args) {
		
		HashMap<Integer,String>hm=new HashMap<Integer, String>();
		hm.put(101,"hyderabad");
		hm.put(103,"delhi");
		hm.put(102,"bangloor");
		hm.put(104,"mumbai");
		
		Map<Integer, String>sinch=Collections.synchronizedMap(hm);
		
		System.out.println(sinch);

	}

}
