package com.practice.question17;

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
import java.util.HashMap;
import java.util.Map;

public class Que17 {
	public void Details(HashMap<Integer,Integer> HM,HashMap<Integer,String>HM1)
	{
		for(Map.Entry<Integer,Integer> k:HM.entrySet())
		{
			int l=k.getValue();
			if(l>=90)
			{
				HM1.put(k.getKey(),"Gold");
			}
			else if(l>80  && l<90)
			{
				HM1.put(k.getKey(),"Silver");
			}
			else
			{
				HM1.put(k.getKey(),"Bronze");
			}
		}
		System.out.println(HM1);
	}

}
