package com.practice.Questions;

/*
 * 1)Create a multithreaded program by creating a subclass of Thread and then creating,
initializing, and 
 * staring two Thread objects from your class. The threads will execute concurrently and 
 * display Java is hot,aromatic
 * , and invigorating to the console window.

 */
public class Question1{

	public static void main(String[] args) {
		
		Question1e obj1=new Question1e();
		
		Question1ee obj2=new Question1ee();
		obj1.start();
		obj2.start();
	}

}
