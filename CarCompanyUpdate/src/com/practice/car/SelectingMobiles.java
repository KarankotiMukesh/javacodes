package com.practice.car;

import java.util.HashMap;
import java.util.Map;

public class SelectingMobiles {
	
	void Select(HashMap<String,String>Apple,HashMap<String,String>Samsung,
			HashMap<String,String>OnePlus,HashMap<String,String>Moto,String s) {
	if(Apple.containsValue(s)||Samsung.containsValue(s)||OnePlus.containsValue(s)||Moto.containsValue(s))
	{
	
	
		for(Map.Entry<String,String> entry:Apple.entrySet())
        {
     	   if(s.equals(entry.getValue()))
     	   {
     		   String s2="";
     		   s2=s2+entry.getKey()+ " ";
     		  System.out.println("Apple :"+ s2);
     		   
     	   }
        }
		

		for(Map.Entry<String,String> entry:Samsung.entrySet())
        {
     	   if(s.equals(entry.getValue()))
     	   {
     		   String s2="";
     		   s2=s2+entry.getKey()+ " ";
     		  System.out.println("Samsung :"+ s2);
     		   
     	   }
        }
		

		for(Map.Entry<String,String> entry:OnePlus.entrySet())
        {
     	   if(s.equals(entry.getValue()))
     	   {
     		   String s2="";
     		   s2=s2+entry.getKey()+ " ";
     		  System.out.println("OnePlus :"+ s2);
     		   
     	   }
        }

		for(Map.Entry<String,String> entry:Moto.entrySet())
        {
     	   if(s.equals(entry.getValue()))
     	   {
     		   String s2="";
     		   s2=s2+entry.getKey()+ " ";
     		  System.out.println("Moto :"+ s2);
     		   
     	   }
        }
	}
	else
	{
		System.out.println("sorry we dont have "+s+" type mobiles" );
	}
	}
	

}
