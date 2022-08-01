package com.practice.question17;

import java.util.HashMap;

/*
 * A school offers medals to the students of tenth based on the following criteria
If(Marks>=90) : Gold
If(Marks between 80 and 90) : Silver
If(Marks between 70 and 80) : Bronze
Note: Marks between 80 and 90 means marks>=80 and marks<90
Write a function which accepts the marks of students as a Hashmap and return the details 
of the students eligible for the medals along with type of medal.
The input hashmap contains the student registration number as key and mark as value.
The output hashmap should contain the student registration number as key and the medal type as value.
 */
public class Question17 {

	public static void main(String[] args) {
		HashMap<Integer,String>HM1=new HashMap<Integer, String>();
     HashMap<Integer,Integer>HM=new HashMap<Integer, Integer>();
     HM.put(101,83);
     HM.put(102,90);
     HM.put(103,74);
     HM.put(104,82);
     HM.put(105,94);
     Que17 obj=new Que17();
     obj.Details(HM,HM1);
	}

}
