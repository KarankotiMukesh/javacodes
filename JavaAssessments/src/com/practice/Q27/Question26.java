package com.practice.Q27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * 27. Exceptions with many catches and its order of execution.
    examine on specific to general. Make sure to include both compile time and runtime exceptions in it.
    try followed by catch and finally with return in all blocks. Examine output.
    try followed by catch with return in both blocks. Examine output.
 */
import java.util.*;
public class Question26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try {
			
		PrintWriter w=new PrintWriter("C:\\Users\\Tech\\Desktop\\HTML/coreAssess.txt");
		     w.write("hii welcome to world of"); 
		     FileReader fr=new FileReader("C:\\Users\\Tech\\Desktop\\HTML/coreAssess.txt");
		     BufferedReader br=new BufferedReader(fr);
		     w.flush();
		     w.close();
			int n=5/1;
			int [] aa=new int[2];
			//aa[4]=9;
			//int m=sc.nextInt();
			String s;
			while((s=br.readLine())!=null)
			{
				//s=br.readLine();
				System.out.println(s);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
			System.out.println("welcome to world full of codes");
		}
	}

}
