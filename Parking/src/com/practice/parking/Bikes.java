package com.practice.parking;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



public class Bikes {
   Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> hm=new HashMap<Integer, String>(15);
	int n=0;
	int temp;
	String bik;
	Set<Integer> l=hm.keySet();
	void AllocateBike(String name,int i)
	{
		
	  if(n!=15)
	   {
		  if(!hm.containsKey(i))
		  {
		    hm.put(i,name);
		    System.out.println("hello "+name+" your parking slot for Bike is booked sucessfully and"+" your slot number is "+ i);
		    n++;
		  }
		  else
		  {
			  System.out.println("The "+i+"booking slot is alredy filled please chhose other slot");
			  temp=sc.nextInt();
			  AllocateBike(name,temp);
		  }
	   }
	  else
	  {
		  System.out.println("parking slots are filled no space there is no space do you want to remove? type s if-- YES-- else n for-- NO--");
		  
	  }

	}
	  public  void deallocateBike(int key)
	  {
		  hm.remove(key);
	  }

}
