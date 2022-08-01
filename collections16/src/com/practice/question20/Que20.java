package com.practice.question20;

import java.util.HashMap;

public class Que20 {

	void ans(String s, HashMap<String,String>hm)
	{
		String [] ar=s.split(" ");
		for(int i=0;i<ar.length;i=i+2)
		{
			hm.put(ar[i],ar[i+1]);
		}
	}

	
}
