package com.practice.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * Ques 4. How are Collections different from Stream? Exaplain the following date and time with example 
 * 1.LocalDate 2.LocalTime 3.LocalDateTime APIs.

 */

public class Question4 {

	public static void main(String[] args) {
		
        
		LocalDate date= LocalDate.now();
		System.out.println("today's date is " +date);
		
		LocalTime time=LocalTime.now();
		System.out.println(" current time is " +time);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println("todays date and urrent time is:  " +datetime);
		
	}

}
