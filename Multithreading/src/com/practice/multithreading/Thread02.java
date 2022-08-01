package com.practice.multithreading;

public class Thread02 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
			       Thread.sleep(1000);
			    System.out.println("hii welcome "+i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
