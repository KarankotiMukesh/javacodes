package com.practice.multithreading;

class A{
	void m1()
	{
		System.out.println("hii this is outside of ");
	}
}



public class ImplementingRunnable extends A implements Runnable {
	public void run()
	{
		System.out.println("hii this is implementation of thread");
	}
	ImplementingRunnable(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		ImplementingRunnable r1=new ImplementingRunnable("hii this is A ");
		r1.m1();
		Thread d=new Thread(r1);
		d.start();
		System.out.println("hii B ");
		
		

	}

}
