package com.practice.StaticApplication;

import java.util.HashMap;

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



public class SelectingSport {
	
	Badminton obj1=new Badminton();
	public void Select(String Sport,String name,HashMap<String,Integer>SlotBadminton,
			HashMap<String,Integer>FootBall,HashMap<String,Integer>BoxCricket)
	{
		
		if(Sport.contentEquals("Badminton"))
		{
			obj1.selectSlot(name,SlotBadminton);
		}
		
		else if(Sport.equals("FootBall"))
		{
			obj1.selectFootBall(name,FootBall);
		}
		else if(Sport.equals("BoxCricket"))
		{
			obj1.selectBoxCricket(name,BoxCricket);
		}
		else
		{
			System.out.println("we dont have that sport in our list sorry:");
		}
		
	}

}
