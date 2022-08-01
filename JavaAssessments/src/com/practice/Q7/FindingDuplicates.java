package com.practice.Q7;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicates {

	
	HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
	
	void duplicates(int [] arr)
	{
		
		for(int a:arr)
		{
			if(hm.containsKey(a))
			{
				hm.put(a,hm.get(a)+1);
			}
			else
			{
				hm.put(a,1);
			}
			
		}
		for(Map.Entry<Integer,Integer> h:hm.entrySet())
		{
			if(h.getValue()>1)
			{
				System.out.println(" duplicated element is "+h.getKey()+" with "+h.getValue()+" times");
			}
		}
		
	}
	
	
	
}
