package com.Exc;
import java.util.*;
/*
 * 2) Write a program for example of multiple catch statements occurring in a
program.
 */
public class Wxce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	try {
		int a=10;
		int b=a/3;
		int [] arr=new int[3];
		arr[1]=90;
		int n;
		n=sc.nextInt();
	}
	catch(ArithmeticException  e)
	{
		e.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
