package com.practice.Q10;

import java.util.Scanner;

public class AddQ2 extends Thread {
	
	static Scanner sc=new Scanner(System.in);
	static double n=sc.nextInt();
	  static double m=sc.nextInt();
	 static  double result1;
	public void  run()
	{
		result1 = n + m;
	}

}
