package com.practice.StaticApplication;




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
import java.util.*;
import java.util.Map.Entry;

public class Badminton {
	Scanner  s=new Scanner(System.in);
	
	
	public void selectSlot(String name,HashMap<String,Integer>SlotBadminton)
	{
		String slot=" ";
		Integer sot;
		
		for(int i=1;i<=10;i++)
		{
			if(SlotBadminton.containsValue(i))
			{
				continue;
			}
			else
			{
				
				slot=slot+String.valueOf(i)+" ,";
			}
		}
		if(slot!=null)
		{
			System.out.println("these are the slots available please selct from below : ");
			System.out.println(slot);
			sot=s.nextInt();
		    sot=(Integer)sot;
		    if(sot>10||sot<1)
		    {
		    	System.out.println("you have selected wrong slot please selct correct slot mentioned below:");
		    	selectSlot( name,SlotBadminton);
		    }
		    else
		    {
		    	if(SlotBadminton.containsValue(sot))
		    	{
		    		System.out.println("you have selected the existing slot please select from below only ");
		    		selectSlot( name,SlotBadminton);
		    	}
		    	else
		    	{
		         	SlotBadminton.put(name,sot);
		         	System.out.println("hii "+name+" you have successfully booked slot "+sot+ " for badminton");
			       System.out.println();
			     System.out.println("these are the boked slots for badminton "+SlotBadminton);
			     System.out.println();
		    	}
			
		    }
		}
		else
		{
			System.out.println("all the slots were filled");
		}
		
		
		
	}
	
	public void selectFootBall(String name,HashMap<String,Integer>FootBall)
	{
		
		

		String slot=" ";
		Integer sot;
		
		for(int i=11;i<=20;i++)
		{
			if(FootBall.containsValue(i))
			{
				continue;
			}
			else
			{
				
				slot=slot+String.valueOf(i)+" ,";
			}
		}
		if(slot!=null)
		{
			System.out.println("these are the slots available please selct from below : ");
			System.out.println(slot);
			sot=s.nextInt();
		    sot=(Integer)sot;
		    if(sot>20||sot<11)
		    {
		    	System.out.println("you have selected wrong slot please selct correct slot mentioned below:");
		    	selectSlot( name,FootBall);
		    }
		    else
		    {
		    	if(FootBall.containsValue(sot))
		    	{
		    		System.out.println("you have selected the existing slot please select from below only ");
		    		selectSlot( name,FootBall);
		    	}
		    	else
		    	{
		    FootBall.put(name,sot);
			System.out.println("hii "+name+" you have successfully booked slot "+sot+ " for badminton");
			System.out.println("these are the boked slots for FootBall "+FootBall);
		    	}
		    }
			
		}
		else
		{
			System.out.println("all the slots were filled");
		}
		
	}
	public void selectBoxCricket(String name,HashMap<String,Integer>BoxCricket)
	{
		
		

		String slot=" ";
		Integer sot;
		
		for(int i=21;i<=30;i++)
		{
			if(BoxCricket.containsValue(i))
			{
				continue;
			}
			else
			{
				
				slot=slot+String.valueOf(i)+" ,";
			}
		}
		if(slot!=null)
		{
			System.out.println("these are the slots available please selct from below : ");
			System.out.println(slot);
			sot=s.nextInt();
		    sot=(Integer)sot;
		    if(sot>30||sot<20)
		    {
		    	System.out.println("you have selected wrong slot please selct correct slot mentioned below:");
		    	selectSlot( name,BoxCricket);
		    }
		    else
		    {
		    	if(BoxCricket.containsValue(sot))
		    	{
		    		System.out.println("you have selected the existing slot please select from below only ");
		    		selectSlot( name,BoxCricket);
		    	}
		    	else
		    	{
		    BoxCricket.put(name,sot);
			System.out.println("hii "+name+" you have successfully booked slot "+sot+ " for badminton");
			System.out.println("these are the boked slots for BoxCricket "+BoxCricket);
		    }
		    }
			
		}
		else
		{
			System.out.println("all the slots were filled");
		}
	
	}

}
