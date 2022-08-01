package com.practice.question19;
import java.util.*;
/*
 * Create a method which accepts an integer array and removes all the duplicates in the array.
Return the resulting array in descending order
 */
public class Question19 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter array size");
	   int n=sc.nextInt();
	   int [] arr=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   Que19 obj=new Que19();
	   obj.Duplicate(arr);

	}

}
