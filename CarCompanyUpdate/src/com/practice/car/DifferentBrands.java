package com.practice.car;

import java.util.HashMap;
import java.util.*;
public class DifferentBrands {
	Scanner sc=new Scanner(System.in);
	
	SelectingMobiles obj=new SelectingMobiles();
	
	public void method()
	{
	HashMap<String,String>Apple=new HashMap<String,String>();
	
	  Apple.put("x1","IOS");
	  Apple.put("x2","IOS");
	  Apple.put("x3","IOS");
	  Apple.put("x3","IOS");
	
	HashMap<String,String>Samsung=new HashMap<String,String>();
	
	  Samsung.put("x1","Android");
	  Samsung.put("x2","Android");
	  Samsung.put("x3","KeyPad");
	  Samsung.put("x4","QueryPad");
	  
	  
	  HashMap<String,String>OnePlus=new HashMap<String,String>();
		
	  OnePlus.put("x1","Android");
	  OnePlus.put("x2","IOS");
	  OnePlus.put("x3","KeyPad");
	  OnePlus.put("x4","QueryPad");
	  
	  
	  HashMap<String,String>Moto=new HashMap<String,String>();
		
	  Moto.put("x1","Android");
	  Moto.put("x2","IOS");
	  Moto.put("x3","KeyPad");
	  Moto.put("x4","QueryPad");
	  
	  
	  System.out.println("please enter DifferentMaker");
	  
	  String s=sc.next();
	  obj.Select(Apple,Samsung,OnePlus,Moto,s);
	  
}

}
