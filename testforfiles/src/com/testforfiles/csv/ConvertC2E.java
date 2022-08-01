package com.testforfiles.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ConvertC2E {

	public static void main(String[] args) throws IOException {

		
		FileReader fr=new FileReader("D:\\JavaIO\\test3.csv");
		File f=new File("C:\\Users\\Tech\\Documents\\Book123.xlsx");
		f.createNewFile();
		PrintWriter pw=new PrintWriter("f");
		Scanner sc=new Scanner(fr);
		String s;
		while(sc.hasNext())
		{
			pw.println(sc.next());
		}
		System.out.println("successs");
	}
}


