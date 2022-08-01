package com.testforfiles.csv;

/*
 * 17. Convert from Excel to a CSV File.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class EXCELToCSV {
    public static void main(String[] args) throws FileNotFoundException {
    	try
    	{
        FileReader filereader=new FileReader("C:\\Users\\Tech\\Desktop\\exceltocsv.xls");
        PrintWriter printwriter=new PrintWriter("D:\\JavaIO\\csvwrite.csv");
        Scanner sc=new Scanner(filereader);
        while(sc.hasNext()) {
            printwriter.println(sc.next());
        }
        System.out.println("Success");
        printwriter.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}