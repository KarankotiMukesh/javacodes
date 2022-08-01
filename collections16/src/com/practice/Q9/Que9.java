package com.practice.Q9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.practice.parkingslots.Hash;



public class Que9  {

	public HashMap<Integer,String> sortbyValue(HashMap<Integer,String>hm1)
	{
		Map<Integer,String> temp
        = hm1.entrySet()
              .stream()
              .sorted((i1, i2)
                          -> i1.getValue().compareTo(
                              i2.getValue()))
              .collect(Collectors.toMap(
                  Map.Entry::getKey,
                  Map.Entry::getValue,
                  (e1, e2) -> e1, LinkedHashMap::new));

    return (HashMap<Integer, String>) temp;
	}
	
	   
	   
	}
	
