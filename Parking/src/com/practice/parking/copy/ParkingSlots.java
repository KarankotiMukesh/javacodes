package com.practice.parking.copy;

import java.util.Scanner;
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
		String s="y";
		String s1;
		int k = 0;
		String s2;
		String name;
		String vehicle;
		
		while(s.equals("y"))
		{
			
			System.out.println("enetr 1 for booking and 2 for remove slot and 3 for list of slots");
			int n=sc.nextInt();
			if(n==1)
			{
		
				System.out.println("please enter your name");
			    name=sc.next();
			     System.out.println("choose Car or Bike");
			       vehicle=sc.next();
			
			
			if(vehicle.equals("Bike"))
			{
				 System.out.println("please enter key ranges from 1-15");
				 b=sc.nextInt();
				
				obj1.AllocateBike(name,b);
			}
			else if(vehicle.equals("Car"))
			{
				 System.out.println("please enter key ranges from 16-30");
				c=sc.nextInt();
				
				obj2.AllocateCar(name,c);
			}
			else
			{
				System.out.println("this parking slot is only for cars and bikes");
			}
			}
			else if(n==2)
			{
			   
		    	System.out.println(" which vehicle car or bike ?");
		    	 s2=sc.next();
		    	if(s2.equals("Car"))
		    	{
		    		System.out.println("mention car key");
		    		k=sc.nextInt();
		    		obj2.deallocateCar(k);
		    	}
		    	else 
		    	{
		    		System.out.println("mention car key");
		    		k=sc.nextInt();
		    		obj1.deallocateBike(k);
		    	}
		    }
			else
			{
				obj1.details();
				obj2.details();
			}
			System.out.println("do you want to continue");
		    s=sc.next();
		
		}
		

	}

}