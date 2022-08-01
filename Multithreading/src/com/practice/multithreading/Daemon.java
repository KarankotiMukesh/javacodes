package com.practice.multithreading;

public class Daemon extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this is diemon thread");
			
		}
		else
		{
			System.out.println("this is not diemon thread");
		}
	}
	

	public static void main(String[] args) {
		
		
		Daemon obj=new Daemon();
		obj.setDaemon(true);
		obj.run();
		System.out.println(" hii "+Thread.currentThread() );
		
		

	}

}
