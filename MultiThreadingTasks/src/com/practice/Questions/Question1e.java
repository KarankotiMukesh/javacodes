package com.practice.Questions;

/*
 * 1)Create a multithreaded program by creating a subclass of Thread and then creating, initializing, and 
 * staring two Thread objects from your class. The threads will execute concurrently and display Java is hot,aromatic
 * , and invigorating to the console window.

 */
public class Question1e extends Thread {
	public void run()
	{
		
		System.out.println("Java is hot,aromatic,and invigorating");
		
	}

}
