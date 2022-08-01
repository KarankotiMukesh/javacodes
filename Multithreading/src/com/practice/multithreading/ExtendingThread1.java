package com.practice.multithreading;

public class ExtendingThread1 extends Thread {
	
	public void run()
	{
		System.out.println("my thread is running");
	}
	

	public static void main(String[] args) {
		
        ExtendingThread1 r=new  ExtendingThread1();
        r.start();
		
	}

}
