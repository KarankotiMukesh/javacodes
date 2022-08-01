package com.practice.parkingslots;
import java.util.*;

public class Cars {
	Scanner sc1=new Scanner(System.in);
	HashMap<Integer,String> hm1=new HashMap<Integer, String>(15);
	int m=16;
	int temp;
	String ca;
	Set<Integer> l=hm1.keySet();
	void AllocateCar(String name,int c)
	{
	  if(m!=30)
	   {
		  if(!hm1.containsKey(c))
		  {
		    hm1.put(c,name);
		    System.out.println("hello "+name+" your parking slot for Bike is booked sucessfully and"+" your slot number is "+ c);
		    m++;
		  }
		  else
		  {
			  System.out.println("The "+c+"booking slot is alredy filled please chhose other slot");
			  temp=sc1.nextInt();
			  AllocateCar(name,temp);
		  }
	   }
	  else
	  {
		  System.out.println("parking slots are filled no space there is no space do you want to remove? type s if-- YES-- else n for-- NO--");
		  ca=sc1.next();
		  if(ca.equals("s"))
		  {
			  hm1.remove(--m);
		  }
	  }
	public  void DeallocateCar(int key)
	  {
		  
	  }
	}

}
