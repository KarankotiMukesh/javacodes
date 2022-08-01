package com.practice.question22;

import java.util.HashMap;
import java.util.Scanner;

import com.practice.question20.Que20;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, String>hm=new HashMap<String, String>();
		  String s=sc.nextLine();
		  Que201 obj=new Que201();
		  
		  String [] arr=s.split(" ");
		  for(int i=0;i<arr.length;i++)
		  {
			  String s1=arr[i];
			  obj.Ans(s1);
		  }
		  
	}

}
