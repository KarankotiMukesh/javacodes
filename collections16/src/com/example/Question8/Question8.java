package com.example.Question8;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		
  TreeMap<Integer,String>tm=new TreeMap<Integer, String>();
       tm.put(101,"Mukesh");
       tm.put(102,"Mukesh");
       tm.put(103,"Mukesh");
       
       for(Map.Entry<Integer, String> e:tm.entrySet())
    	   System.out.println(e.getKey()+" "+e.getValue());
       
	}

}
