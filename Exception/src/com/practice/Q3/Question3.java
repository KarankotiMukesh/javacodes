package com.practice.Q3;
import java.util.*;

/*
 * 3) Write a program for creation of user defined exception.

 */

class User extends Exception
{
	
}



public class Question3 {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a age of yours:");
		 int age=sc.nextInt();
		try {
		 if(age>18)
		 {
			 System.out.println("you are major you can come in");
		 }
		 else
		 {
			 throw new User();
		 }
		}
		catch(User e)
		{
			System.out.println("you are minor please come wen you are 18");
		
			
		}
		
		
	}

}
