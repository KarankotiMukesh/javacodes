package com.practice.Q9;
import java.util.*;
/*
 * Write a program to sort HashMap by value?
 */
public class Quetion9 {

	public static void main(String[] args) {
	  HashMap<Integer,String>hm1=new HashMap<Integer,String>();
      HashMap<Integer,String> hm=new HashMap<Integer, String>();
      
    hm1.put(101,"mukesh");
    hm1.put(102,"apple");
    hm1.put(103,"banana");
    hm1.put(104,"mukki");
    
    Que9 obj=new Que9();
    
   System.out.println( obj.sortbyValue(hm1));
    	
    
     
	}
}
