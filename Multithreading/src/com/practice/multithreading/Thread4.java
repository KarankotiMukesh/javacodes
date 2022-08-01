package com.practice.multithreading;


	public class Thread4{
	
	public static void main(String[] args) {
		
		Thread01 obj=new  Thread01();
		Thread02 obj1=new Thread02();
		obj.start();
//		obj1.start();
		try
		{
			obj.join(1000);
			
		}
         
       catch(Exception e)
		{
    	   System.out.println(e);
		}
		obj1.start();
          
          
		
	}

}
