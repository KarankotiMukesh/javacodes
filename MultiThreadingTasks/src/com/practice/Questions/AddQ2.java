package com.practice.Questions;

import java.util.Scanner;

/*
 * 2. A thread has "add" operation,other thread performs"avg" and other thread performs "display" 
 * operation which displays avg and add details after the two threads are compeletely performed.

 */
public class AddQ2 extends Thread {
	static Scanner sc=new Scanner(System.in);
	static double n=sc.nextInt();
	  static double m=sc.nextInt();
	 static  double result1;
	public void  run()
	{
		result1 = n + m;
	}
}
