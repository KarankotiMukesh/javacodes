package com.practice.Q16;

/*
 * 16. Convert from CSV to excel.

 */

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVToEXCEL {
        public static void main(String[] args) throws IOException {
        	try
        	{
            FileReader filereader=new FileReader("D:\\JavaIO\\csvtoexcel.txt");
            PrintWriter printwriter=new PrintWriter("C:\\Users\\Tech\\Desktop\\exceltocsv.xls");
            Scanner sc=new Scanner(filereader);
            while(sc.hasNext()) {
                printwriter.println(sc.next());
            }
            printwriter.close();
            System.out.println("Success");
        }
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        
        }
}