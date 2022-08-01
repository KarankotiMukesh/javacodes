package com.example.Question7;
/*
 *  Write a program to reverse ArrayList in java?
 */
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(6);
		al.add(5);
		al.add(2);
		al.add(10);
		int n=al.size();
		for(int i=n-1;i>=0;i--)
		System.out.println(al.get(i));
	}

}
