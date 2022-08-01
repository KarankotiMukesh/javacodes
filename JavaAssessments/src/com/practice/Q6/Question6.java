package com.practice.Q6;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
/*
 * 6. User should be asked to enter any date.
	1 method checks if input date is earlier to present date.
	1 method checks if input date is after to present date.
	1 method converts given date into "yyyy-MM-dd HH:mm:ssZ" pattern.
 */
public class Question6 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		try
		{
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		String s=sc.next();
		Date present=new Date();
		System.out.println(present);
	      Date d1 = sdformat.parse(s);
	      Date d2 = sdformat.parse(sdformat.format(present));
	      System.out.println("The date 1 is: " + sdformat.format(d1));
	      System.out.println("The date 2 is: " + sdformat.format(d2));
	      if(d1.compareTo(d2) > 0) {
	         System.out.println("Date 1 occurs after Date 2");
	      } else if(d1.compareTo(d2) < 0) {
	         System.out.println("Date 1 occurs before Date 2");
	      } else if(d1.compareTo(d2) == 0) {
	         System.out.println("Both dates are equal");
	      }
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
