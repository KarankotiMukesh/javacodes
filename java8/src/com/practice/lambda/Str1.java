package com.practice.lambda;
import java.util.*;
public class Str1 {

	public static void main(String[] args) {
		StringJoiner j=new StringJoiner(" ,","[","]");
		j.add("hii");
		j.add("hloo");
		j.add("hey");
		System.out.println(j);
		StringJoiner j1=new StringJoiner(" ,","[","]");
		j1.add("hii");
		j1.add("hloo");
		j1.add("hey");
		StringJoiner j2=j.merge(j1);
		System.out.println(j2);
	}

}
