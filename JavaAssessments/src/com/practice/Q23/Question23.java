package com.practice.Q23;

import java.util.ArrayList;
import java.util.OptionalDouble;

/*
 * 23. Perform calculations such as count,sum,min,avg,max for given input of arrayList
 *  using Stream API.
 */
public class Question23 {

	public static void main(String[] args) {
	    ArrayList<Integer> al=new ArrayList();

      al.add(1);
     al.add(2);
      al.add(1);
      al.add(3);
     
     al.add(2);
     
     int n =(int) al.stream().count();
     System.out.println(n);
     int m =(int) al.stream().min(Integer::compare).get();
     System.out.println(m);
     int ma =(int) al.stream().max(Integer::compare).get();
	    System.out.println(ma);
	    int  s=(int) al.stream().reduce(0,(a,b)->a+b);
	    System.out.println(s);
	    
	    
	    
	    
	}

}
