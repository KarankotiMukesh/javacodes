package com.practice.Q2;

/*
 * Ques2. WAP to Convert an Array to ArrayList in Java .Use three ways for 
 * conversion and its vice versa.

 */
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		
		
		int[] arr=new int[5];
       arr[0]=3;
       arr[1]=9;
       arr[2]=8;
       arr[3]=7;
       arr[4]=6;
       List<Integer>al=new ArrayList<Integer>();
       //List<Integer> al=Arrays.asList(arr);
       for(int i=0;i<arr.length;i++)
       {
    	   al.add(arr[i]);
       }
       System.out.println(al);
//       for(int i:arr)
//       {
//       	al.add(i);
//       }
//       System.out.println(al);
      // Collections.addAll(al, arr);
	}
    
}
