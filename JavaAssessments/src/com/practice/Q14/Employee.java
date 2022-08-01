package com.practice.Q14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 14. Employee has methods for create, read and write to a file.
	Manager extends employer and have these file methods overriden
	(Examine here without handling the exceptions) along with delete the file.
 */

public class Employee {
	int id;
	String startYear;
	String rating;
	Employee(int id,String startYear,String rating)
	{
		this.id=id;
		this.startYear=startYear;
		this.rating=rating;
	}
	
	void create() throws IOException
	{
		File f=new File("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		f.createNewFile();
	}
	void read() throws FileNotFoundException, IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		BufferedReader br=new BufferedReader(fr);
		
	}
	void write() throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		pw.println();
		
	}
	void delete()
	{
		
	}

}
//@override
class Manager extends Employee{
	
	Manager(int id, String startYear, String rating) {
		super(id, startYear, rating);
		// TODO Auto-generated constructor stub
	}
	void create() throws IOException
	{
		File f=new File("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		f.createNewFile();
	}
	void read() throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
		BufferedReader br=new BufferedReader(fr);
	
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
	
			// TODO Auto-generated catch block
	
		System.out.println("successfull");
	    
		
	}
	void write() throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("C:\\Users\\Tech\\Desktop\\CarCompany\\Q14.txt");
	    Manager obj=new Manager(101,"2022","4.0");
	    Manager obj1=new Manager(102,"2023","4.2");
		pw.println(obj.id+" " +obj.rating+" " +obj.startYear);
		pw.println(obj1.id+" " +obj1.rating+" " +obj1.startYear);
	

		pw.flush();
		pw.close();
		
	}
	
	
	
	
}
