package com.practice.multithreading;

public class Thread01 extends Thread {
	
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
					e.printStackTrace();
				}
			}
		}

}
