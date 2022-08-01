package com.practice.Q19;

/*
 * 19. Implement an exception "InvalidUserName".
	User inputs his UserName in console. When length of userName is <10 or if it has "&", 
	this should be handled by the exception.
 */
import java.util.*;

class A extends Exception{
	
	
	
}


public class Question19 {

	public static void main(String[] args) throws A {
		Scanner sc=new Scanner(System.in);

		System.out.println("please enter your name");
		
		String s=sc.next();
		try
		{
		if(s.length()<10||s.contains("&"))
		{
			throw new A();
		}
		else
		{
			System.out.println("welcome valid userName ");
		}
		}
		catch(Exception A)
		{
			System.out.println("invalid user name please enter atleast 10 characters and it should not containd &");
		}
	}

}
