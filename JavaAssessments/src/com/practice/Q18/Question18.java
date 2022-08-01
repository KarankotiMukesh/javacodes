package com.practice.Q18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;
 /*
 * 18. Fetch Employee details on decreasing order of their rating and decreasing order of their StartYear from Q.14.

 */

class Decreasing implements Comparable<Decreasing>{

    public 	String id;
	public String rating;
	public String year;
	
	Decreasing(String id,String rating,String year)
	{
		this.id=id;
		this.rating=rating;
		this.year=year;
	}

	public int compareTo(Decreasing  o) {
		int compare=o.year.compareTo(this.year);
		if(compare>0)
		{
			return 1;
		}
		else if(compare<0)
		{
			return -1;
		}
		else
		{
		  return 0;
		}

		
		
	}
	
}


public class Question18 {

	public static void main(String[] args) throws IOException {
	
		
		FileReader fr=new FileReader("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		ArrayList<Decreasing>al=new ArrayList<Decreasing>();
		while((s=br.readLine())!=null)
		{
			String [] arr=s.split(" ");
			Decreasing obj=new Decreasing(arr[0],arr[1],arr[2]) ;
			al.add(obj);
			
			
		}
		Collections.sort(al);
		for(Decreasing s1:al)
		{
			System.out.println(s1.id +" "+s1.rating+ " "+s1.year);
		}
	}

}
