package com.practice.multithreading;

public class Threading extends Thread {

	public void run()
	{
		System.out.println("hii thread has occured");
	}
	
	public static void main(String[] args) {
		Threading t=new Threading();
		t.start();

	}

}
