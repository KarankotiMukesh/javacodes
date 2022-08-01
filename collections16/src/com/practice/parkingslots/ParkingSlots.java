package com.practice.parkingslots;
import java.util.*;
/*
 * parking slots
1. there are two basements b1 and b2 both contains 30 slots
2. b1 for bikes and b2 for cars
3. allocate a vehicles with slots and generate a receipt and don't allocate a single slot for two vehicles
4. and store the data in a file
 */
public class ParkingSlots {

	public static void main(String[] args) {
		Bikes obj1=new Bikes();
		Cars obj2=new Cars();
		Scanner sc=new Scanner(System.in);
		int b=0;
		int c=15;
		String s;
		String s1;
		int k;
		String s2;
		String name;
		String vehicle;
		
		do
		{
			
			System.out.println("please enter your name");
			 name=sc.next();
			System.out.println("choose Car or Bike");
			 vehicle=sc.next();
			
			
			if(vehicle.equals("Bike"))
			{
				 System.out.println("please enter key");
				 b=sc.nextInt();
				
				obj1.AllocateBike(name,b);
			}
			else if(vehicle.equals("Car"))
			{
				 System.out.println("please enter key");
				c=sc.nextInt();
				
				obj2.AllocateCar(name,c);
			}
			else
			{
				System.out.println("this parking slot is only for cars and bikes");
			}
			
			System.out.println("do you want to continue");
		    s=sc.next();
		    System.out.println("Any vehicle is going out of parking slot");
		    s1=sc.next();
		    if(s1.equals("yes"))
		    {
		    	System.out.println(" which vehicle ?");
		    	s2=sc.next();
		    	if(s2.equals("Car"))
		    	{
		    		System.out.println("mention car key");
		    		k=sc.nextInt();
		    		obj2.DeallocateCar(k);
		    	}
		    	else 
		    	{
		    		
		    	}
		    }
		    
		}while(s.equals("y"));

	}

}
