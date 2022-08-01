package com.practice.Streams1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		
   ArrayList<Strem2> al=new ArrayList<Strem2>();
        al.add(new Strem2(101,"mukesh",200000));
        al.add(new Strem2(102,"muke",20000));
        al.add(new Strem2(103,"karankot",40000));
        al.add(new Strem2(104,"mukki",2000));
		
		List<Integer> a=al.stream().filter(i->i.salary>3000).map(i->i.salary).collect(Collectors.toList());
		System.out.println(a);
	}

}
