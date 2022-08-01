package com.practice.Q26;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 26. Perform handson on every methods on OptionalClass, ParallelSort, StringJoiner,Collector class in Streams.
 */
public class Question26 {

	public static void main(String[] args) {
		
		String [] word=new String[7];
		
		Optional<String> opt=Optional.ofNullable(word[3]);
		if(opt.isPresent())
		{
			String w=word[3].toUpperCase();
		}
		else
		{
			System.out.println("in the specified index there is no value it is null");
		}
		

		
		
		int [] arr= {-1,0,7,-2,7};
		for(int i:arr)
		System.out.print(i+ " ");
		
		System.out.println();
	 Arrays.parallelSort(arr);
	 
	 for(int j:arr)
		System.out.print(j+" ");
		System.out.println();
	 
	 StringJoiner s=new StringJoiner(",");
	 s.add("mukesh");
	 s.add("mukki");
	 s.add("karankoti");
	 
	 System.out.println(s);
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 al.add(-1);
	 al.add(0);
	 al.add(6);
	 al.add(9);
	 
	 List l=(List) al.stream().filter(i->i>0).collect(Collectors.toList());
	 System.out.println(l);
	 
	}

}
