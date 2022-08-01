package com.practice.Q10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Question10 {

	public static void main(String[] args) throws IOException {
		HashMap<Integer,String>h=new HashMap<Integer,String>();
		h.put(101,"mukesh");
		h.put(102,"mukki");
		h.put(103,"karankoti");
		h.put(109,"mukesh.k");
		try
		{
			
		
		FileOutputStream ob=new FileOutputStream("C:\\Users\\Tech\\Desktop\\CarCompany\\hashmap.txt");
		ObjectOutputStream o=new ObjectOutputStream(ob);
		o.writeObject(h.toString());
		o.close();
		System.out.println("successfull");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}


}
