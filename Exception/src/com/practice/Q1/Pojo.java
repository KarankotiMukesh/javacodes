package com.practice.Q1;

/*
 * Ques1. WAP on custom exception where it gives an 'Invalid Employee ID' Exception
 *  while entering into an Organization or office .
Create a pojo class that contains Employee details including name ,id ,address 
.If ID is not found must give exception mesaage that "given Employee ID is not 
found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office". 
Take input from user and check the ID with the already existing Employee ids
Note: Please add multiple employee details
 */

public class Pojo {

	String name;
	int id;
	String address;	

	public Pojo(String name, int id, String address) {
		
		this.name=name;
		this.id=id;
		this.address=address;
	
	}

	
	
	
	
	
}
