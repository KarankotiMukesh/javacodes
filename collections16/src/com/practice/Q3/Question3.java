package com.practice.Q3;
import java.util.*;

/*
 * Ques 3. WAP to map multiple countries with their respective capitals using map .
 * Iterating them using
1.foreach loop 
2.keyset iterator 
3.entryset iterator along with foreach 
4.EntrySet along with Java iterator
 */


public class Question3 {

	public static void main(String[] args) {
		
		
		HashMap<String ,String>hm=new HashMap<String,String>();
		
		hm.put("India","NewDelhi");
		hm.put("pakisthan","Islamabad");
		hm.put("China","Beijing");
		hm.put("Russia","Moscow");
		
		for(Map.Entry<String,String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		for(String s:hm.keySet())
		{
			System.out.println(s);
		}
		Iterator<Map.Entry<String,String>> itr=hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String ,String> entry=itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
