package com.practice.Files;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
public class CreatingFile2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
   try {
	   
	   PrintWriter w = new PrintWriter("D:\\JavaIO\\Text2File.txt");
	   PrintWriter w1 = new PrintWriter("D:\\JavaIO\\CreatingFiles.txt");
	   File f=new File("D:\\JavaIO\\Text2File.txt");
	   f.createNewFile();
	   if(f.exists()) {
		   System.out.println("alread");
	   }
	   else {
		   System.out.println("not");
	   }
		w.print(" hii mukesh welcome to 20w22");
		w.println("hii");
		w.println("welcome");
		w.print(100);
		w.flush();
		w.close();
		FileReader fr= new FileReader("D:\\JavaIO\\Text2File.txt");
		BufferedReader br=new BufferedReader(fr);
		int i,j;
		String s;
		Long l=f.lastModified();
		System.out.println(l);
		Date d=new Date(l);
		System.out.println(" this is the modified date of a file: " +d);
		System.out.println("is file hidden? :"+f.isHidden());
		
//	while((i=fr.read())!=-1)
//	{
//		System.out.print((char)i);
//		}
//   
		while((s=br.readLine())!=null)
		{
			w1.println(s);
		}
		
   }
   catch(Exception e)
   {
	   e.printStackTrace();
	   
   }
		try {
			
			File f1=new File("D:\\JavaIO\\mukki.txt");
			f1.delete();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
