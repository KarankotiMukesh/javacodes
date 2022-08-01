package com.practice.question20;
import java.util.*;
/*
 * A String contains a list of states and capitals. Write a method which can parse the string and return the states
and capitals as map with state as key and capital as value.
The String is in the below format. The state and capital is separated by a delimiter (del1).
There will be multiple state-capital pairs and each state – capital pair is separated by another delimiter (del2).
Ex: Input will be tamilnadu||chennai-karanataka||bengaluru.
Here, || will be provided as del1 and - will be provided as del2.
 */
public class Question20 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		HashMap<String, String>hm=new HashMap<String, String>();
		  String s=sc.nextLine();
		  Que20 obj=new Que20();
		  obj.ans(s,hm);
        System.out.println(hm);
	
	}

}
