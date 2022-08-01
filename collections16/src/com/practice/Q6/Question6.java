package com.practice.Q6;
import java.util.*;
/*
 * Write a program to convert HashSet to Array?
 */
public class Question6 {

	public static void main(String[] args) {
		HashSet<Integer>ha=new HashSet<Integer>();
		ha.add(8);
		ha.add(5);
		ha.add(6);
		ha.add(8);
       Integer[] ar=(Integer[]) ha.toArray();
       for(int i=0;i<ar.length;i++)
       {
    	   System.out.println(ar[i] + " ");
       }
		
	}

}
