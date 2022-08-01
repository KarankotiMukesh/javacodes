package com.practice.Q12;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * 12 Write a program to serialize an ArrayList in java?

 */
import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> a=new ArrayList<String>();
           
		a.add("mukesh");
		a.add("mukki");
		a.add("karankoti");
		a.add("mukesh.k");
		
		FileOutputStream ob=new FileOutputStream("C:\\Users\\Tech\\Desktop\\CarCompany\\ArrayList.txt");
		
		ObjectOutputStream o=new ObjectOutputStream(ob);
         
		o.writeObject(a.toString());
		o.flush();
		o.close();
		System.out.println("successfull");
		
	}

}
