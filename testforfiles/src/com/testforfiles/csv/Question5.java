package com.testforfiles.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 5.Write a program to write and read a CSV file or Excel file, file should contain some data 
 * about employees (like empId, empName, empRole..etc).

 */


class Write
{
	
	String empid;
	 String empName;
	 String emprole;
	
	public Write(String empid,String empName, String emprole )
	{
		this.empid=empid;
		this.empName=empName;
		this.emprole=emprole;
	}

	
}

public class Question5 {

	public static void main(String[] args) throws IOException {
        Write obj3=new Write("empid","empName","emprole");
		Write obj=new Write("1941","mukesh","trainee");
		Write obj1=new Write("1940","manideep","trainee");
		Write obj2=new Write("1939","Stranger","trainee");
		File f=new File("C:\\Users\\Tech\\Desktop\\CarCompany\\q51.csv");
		f.createNewFile();
		FileReader fr=new FileReader("C:\\Users\\Tech\\Desktop\\CarCompany\\q51.csv");
		BufferedReader br=new BufferedReader(fr);
		PrintWriter pw=new PrintWriter("C:\\Users\\Tech\\Desktop\\CarCompany\\q51.csv");
		   pw.println(obj3.empid+obj3.empName+obj3.emprole);
		   pw.println();
		  pw.println(obj.empid+obj.empName+obj.emprole);
		  pw.println();
		  pw.println(obj1.empid+obj1.empName+obj1.emprole);
		  pw.println();
		  pw.println(obj2.empid+obj2.empName+obj2.emprole);
		  pw.flush();
		  pw.close();
		 String s;
		  while((s=br.readLine())!=null)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println("successful");
		  
	}

}
