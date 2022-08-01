package com.practice.Questions;

/*
 * 2. A thread has "add" operation,other thread performs"avg" and other thread performs "display" 
 * operation which displays avg and add details after the two threads are compeletely performed.

 */
import java.util.*;
public class DisplayQ2 extends Thread{
	  
	public void run()
	{
		System.out.println(AvgQ2.result);
		System.out.println(AddQ2.result1);
	}

}
