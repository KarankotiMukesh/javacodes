package com.practice.Question18;

import java.util.TreeSet;

public class Que18 {
	TreeSet<String> ts1=new TreeSet<String>();
	TreeSet<String> ts=new TreeSet<String>();
	public void Sorting(String [] arr)
	{
    for(int i=0;i<6;i++)
    {
    	ts.add(arr[i]);
    }
    int n=ts.size()/2;
    int m=0;
    for(String s:ts )
    {
    	
    	if(m<n)
    	{
    		String h=s;
    		h=h.toUpperCase();
    		ts1.add(h);
    		m++;
    	}
    	else
    	{
    		String h=s;
    		h=h.toLowerCase();
    		ts1.add(h);
    	}
    	
    }
    
    System.out.println(ts1);
    
	}

}
