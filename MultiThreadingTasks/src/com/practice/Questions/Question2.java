package com.practice.Questions;

/*
 * 2. A thread has "add" operation,other thread performs"avg" and other thread performs "display" 
 * operation which displays avg and add details after the two threads are compeletely performed.

 */
public class Question2 {

	public static void main(String[] args) {
		
		
		AddQ2 obj1=new AddQ2();
		obj1.start();
		AvgQ2 obj2=new AvgQ2();
		obj2.start();
		DisplayQ2 obj=new DisplayQ2();
		obj.run();
	}

}
