package com.practice.lambda;
import java.util.*;
public class Optiona {

	public static void main(String[] args) {
		
		String[] arr=new String[12];
		//arr[4]="hii how are you";
		
		Optional<String> op=Optional.ofNullable(arr[4]);
		if(op.isPresent())
		{
			System.out.println("String is not empty");
		}
		else
		{
			System.out.println("String is empty");
		}

	}

}
