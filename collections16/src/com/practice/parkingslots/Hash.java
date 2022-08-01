package com.practice.parkingslots;

import java.util.*;
public class Hash {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      HashMap<Integer,String> hm7=new HashMap<Integer,String>();
      int j;
      String h;
      Set<Integer> l=hm7.keySet();
      for(int i=0;i<5;i++)
      {
    	 j= sc.nextInt();
    	 h=sc.next();
    	 if(!hm7.containsKey(j))
    	 {
    		 hm7.put(j,h);
    	 }
    	 else
    	 {
    		 System.out.println("the key is alredy entered");
    	 }
      }
     
	}

}
