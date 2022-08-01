package com.practice.StaticApplication;

import java.util.*;

/*
 * Problem statement
Create an application to book slots at a Sports complex
1. On load(execution) create data 
A. Badminton court - 10 slots each with timings against each ( 1 hour per each slot)
B. Football slots - 20 slots (30 mins for each slot)
C. Box cricket -5 slots ( 2 hours each)

2. User needs to enter his/her name
3. Show the list of sports
4. Maintain the timing slots against each sport in other list.
5. Once user gives input of which sport he/she wants on the next step show the sport name and available slots.
6. Once the user selects a slot and enters the data , show a success message with his booking details and 
delete the slot record from the list.
7. Then when they hit enter again ask for new user details until the data is empty / program is terminated
8.The booking details need to be store in excel file
 */


public class SportsComplex {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	
		ArrayList<String> SportsList=new  ArrayList<String>();
		HashMap<String,Integer>SlotBadminton=new HashMap<String, Integer>(10);
		HashMap<String,Integer>FootBall=new HashMap<String, Integer>(10);
		HashMap<String,Integer>BoxCricket=new HashMap<String, Integer>(10);
		Badminton obj2=new Badminton();
		SportsList.add("Badminton");
		SportsList.add("FootBall");
		SportsList.add("BoxCricket");
		String c="yes";
	
		while(c.equals("yes")) {
			
		
		System.out.println("please enter your name: ");
		String name;
		name=sc.next();
		System.out.println("hii "+ name+" please select sport from below list");
		System.out.println(SportsList);
		String Sport;
		Sport=sc.next();
		SelectingSport obj=new SelectingSport();
		switch(Sport)
		{
		case "Badminton":
		{
		
		obj.Select(Sport,name,SlotBadminton,FootBall,BoxCricket);
		break;
		}
		case "FootBall":
		{
			obj.Select(Sport,name,SlotBadminton,FootBall,BoxCricket);
			break;
		}
		case "BoxCricket":
		{
			obj.Select(Sport,name,SlotBadminton,FootBall,BoxCricket);
			break;
		}
		
		}
		
		System.out.println("do you want to continue? please select yes for continue No for exit");
		c=sc.next();
		}
		
		
		
		
	}

}
