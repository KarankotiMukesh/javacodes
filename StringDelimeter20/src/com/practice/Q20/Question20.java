package com.practice.Q20;

/*
 * A String contains a list of states and capitals. Write a method which can parse the string and return the states
and capitals as map with state as key and capital as value.
The String is in the below format. The state and capital is separated by a delimiter (del1).
There will be multiple state-capital pairs and each state – capital pair is separated by another delimiter (del2).
Ex: Input will be tamilnadu||chennai-karanataka||bengaluru.
Here, || will be provided as del1 and - will be provided as del2.
 */
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();

	Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		
//		String [] arr=s.split("[||-]");
//		
//		for(int i=0;i<arr.length;i=i+2)
//		{
//			hm.put(arr[i],arr[i+1]);
//		}
//		System.out.println(hm);
		  String s=sc.nextLine();
	  String [] arr=s.split("[- ||]+");
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
		  }
		
	}

}
