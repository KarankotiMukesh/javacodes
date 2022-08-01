package com.practice.Question18;
import java.util.*;
/*
 * Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
Return the resulting array.
Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE
 */
public class Question18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []arr=new String[6];
		Que18 obj=new Que18();
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.next();
		}
       obj.Sorting(arr);
	}

}
