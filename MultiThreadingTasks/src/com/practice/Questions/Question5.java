package com.practice.Questions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageOutputStream;

/*
 * 5. Exceptions with many catches and its order of execution.examine on specific to general. 
 * Make sure to include both compile time and runtime exceptions in it.
try followed by catch and finally with return in all blocks. Examine output. try followed by
 catch with return in both blocks. Examine output.
 */
import java.util.*;
public class Question5 {

	public static void main(String[] args) throws IOException   {
		
		Scanner sc= new Scanner(System.in);
		try
		{
			int []a=new int[3];
			a[0]=4;
//			FileOutputStream f=new FileOutputStream(" C:\\Users\\Tech\\Desktop\\CarCompany\\AList.txt");
//			ObjectOutputStream o=new ObjectOutputStream(f);
//			o.writeObject("mukesh");
			int num=sc.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
//		catch( FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("hii welcome to world where full of codes::");
		}

	}

}
