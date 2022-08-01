package com.practice.serlization;
import java.io.*;
public class Serliz2 implements Serializable {
	
	int roll;
	String name;
	String company;
	
	public Serliz2(int roll,String name,String company)
	{
		this.roll=roll;
		this.name= name;
		this.company=company;
	}

}
