package com.practice.Q1;

/*
 * Ques1. WAP on custom exception where it gives an 'Invalid Employee ID' Exception while
 *  entering into an Organization or office .
Create a pojo class that contains Employee details including name ,id ,address .If ID is 
not found must give exception mesaage that "given Employee ID is not found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office". Take 
input from user and check the ID with the already existing Employee ids
Note: Please add multiple employee details
 */
import java.util.*;

class Myexception extends Exception{
	
	
}


public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Pojo obj4=new Pojo("Mukesh",101,"Nalgonda");
		Pojo obj1=new Pojo("Pavan",102,"Warangal");
		Pojo obj2=new Pojo("Mukki",103,"Hyderabad");
		Pojo obj3=new Pojo("vineeth",104,"Chennai");
		System.out.println("enter the employee id");
		int i=sc.nextInt();
		
		try {
			if(obj1.id==i||obj2.id==i||obj3.id==i||obj4.id==i)
			{
				System.out.println("welcome to office");
			}
			else
			{
				throw new Myexception();
			}
		}
		catch(Myexception e)
		{
			System.out.println("invalid user id");;
		}
		
	}

}
