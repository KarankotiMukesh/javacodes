package com.testforfiles.csv;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVWrite {
	
	public static void main(String[] args) {
		try {
			PrintWriter pw=new  PrintWriter("D:\\\\JavaIO/csvwrite.csv");
			String[] record = "4,David,Miller,Australia,30".split(",");
			pw.println(record);
			pw.flush();
			pw.close();
			System.out.println("printed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
