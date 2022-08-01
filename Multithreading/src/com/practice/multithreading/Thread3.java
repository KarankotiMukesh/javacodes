package com.practice.multithreading;

public class Thread3 extends Thread {
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}

	public static void main(String[] args) {
		
		
		Thread3 obj=new Thread3();
		Thread3 obj1=new Thread3();
		
		obj.start();
		obj1.start();

	}

}
