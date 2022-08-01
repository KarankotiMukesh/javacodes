package com.practice.javaTaskLast;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 5.Write a program to write and read a CSV file or Excel file, file should contain 
 * some data about employees (like empId, empName, empRole..etc).

 */
public class Files5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		try
		{
			FileReader fr=new FileReader("D:\\JavaIO\\JTI5.csv ");
	PrintWriter pw=new PrintWriter("D:\\JavaIO\\JTI5.csv ");
	pw.println(101);
	pw.println("mukesh");
	pw.println(" Employee");
	System.out.println("Successfull ");
	pw.flush();
		pw.close();
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 

	}

}
