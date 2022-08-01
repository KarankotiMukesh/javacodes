package com.cellphone;

/*Ques 1.Consider a cell phone where you save your Contacts. Suppose a person has two contact numbers.
 *  For the ease of accessibility,
your cell phone provides you the functionality where you can save two or more numbers under the same name. 
use polymorphism concept in this scenario
 */
import java.util.*;
public class Cell {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String s=sc.next();
		System.out.println("how many contacts do you have?");
		int n=sc.nextInt();
		
		Cellphone obj=new Cellphone();
		if(n==1)
		{
			System.out.println("please enter your contact number");
			long num=sc.nextLong();
		    obj.contacts(num,s);
		}
		else 
		{
			System.out.println("please enter your contacts numbers");
			long num1=sc.nextLong();
			long num2=sc.nextLong();
			obj.contacts(num1,num2,s);
		}
		
	}
}
