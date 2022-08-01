package com.practice.Streams1;

import java.awt.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Stream1 {

	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
	
      al.add(3);
      al.add(2);
      al.add(3);
      al.add(5);
      al.add(8);
      System.out.println(al);
      
      System.out.println("after using streams");
      
     List ls
      =  (List) al.stream()
            .map(i -> i +6)
            .collect(Collectors.toList());
      System.out.println(ls);
      
      
      
    
      
	}

}
