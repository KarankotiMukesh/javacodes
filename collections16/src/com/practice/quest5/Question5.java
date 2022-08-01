package com.practice.quest5;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Write a program to convert LinkedList to ArrayList?
 */
public class Question5 {

	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(3);
		ls.add(4);
		ls.add(6);
		ls.add(3);
		ArrayList<Integer>al=new ArrayList<Integer>(ls);
		System.out.println(al);
	}

}
