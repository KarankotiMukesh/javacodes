package com.practice.Questions;

public class AvgQ2 extends Thread  {
	
	static double value1=AddQ2.n;
	static double value2=AddQ2.m;
	static double result;
	public void run()
	{
		result=(value1+value2)/2;
	}

}
