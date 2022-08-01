package com.practice.question16;
import java.util.*;
/*
 * Input:HashMap
{selva:75.6f, abi:89.5f,ram:40}
Output:hashmap
{selva:pass,abi:pass,ram:fail}
If the mark is >60 return the names and their status as pass in a output hashmap else fail
*/
 
public class Question16 {

	public static void main(String[] args) {
		HashMap<String,String>HM=new HashMap<String, String>();
		HashMap<String,Double>hm=new HashMap<String,Double>();
		hm.put("selva",75.6);
		hm.put("abi",89.5);
		hm.put("ram",40.0);
		for(Map.Entry<String, Double> j:hm.entrySet())
		{
			double n=j.getValue();
			if(n>60.0)
			{
				HM.put(j.getKey(),"pass");
			}
			else
			{
				HM.put(j.getKey(),"fail");
			}
		}
		System.out.println(HM);
        
	}

}
