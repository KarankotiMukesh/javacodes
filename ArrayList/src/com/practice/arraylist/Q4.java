package com.practice.arraylist;
import java.util.*;
/*
 * perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections
 */
public class Q4 {

	public static void main(String[] args) {
		
   ArrayList<Integer> al=new ArrayList<Integer>();
   al.add(3);
   al.add(7);
   al.add(10);
  
   ListIterator<Integer> itr=al.listIterator();
   ListIterator<Integer> itr1=al.listIterator(1);
   ListIterator<Integer> itr2=al.listIterator(1);
   ListIterator<Integer> itr3=al.listIterator(3);
  
  while(itr.hasNext())
  {
	  int i=itr.next();
	  System.out.println(i);
  }
  System.out.println("this is next");
  while(itr1.hasNext())
  {
	  int i=itr1.next();
	 System.out.println(i);
  }
  System.out.println("this is previous");
  while(itr2.hasPrevious())
  {
	  int i=itr2.previous();
	  System.out.println(i);
  }
  System.out.println("adding element to specific index 3 of value 6");
  al.add(3,6);
  System.out.println(al);
  System.out.println("sorting ArrayList in descending order");
  Collections.sort(al,Collections.reverseOrder());
  System.out.println(al);
  while(itr3.hasNext())
  {
	  al.add(11);
	  break;
  }
  System.out.println("inserted element wih listIterator");
  System.out.println(al);
  HashSet<String> hs=new HashSet<String>();
   hs.add("apple");
   hs.add("mango");
   hs.add("banana");
   System.out.println(hs);
   
   ArrayList<String> list=new ArrayList<String>(hs);
   Collections.sort(list);
   System.out.println("Hsort ArrayList of Alphabeticall String ");
   System.out.println( list);
   ArrayList<Integer> a=new ArrayList<Integer>(al);
   Collections.sort(a);
   System.out.println("F sorting ArrayList");
   System.out.println(a);
   a.set(3,20);
   System.out.println("g replace at specific index");
   System.out.println(a);
   System.out.println("h searching element");
   System.out.println(a.contains(7));
   System.out.println("I removing element");
   a.remove(0);
   System.out.println(a);
 ArrayList<Integer> i=new ArrayList<Integer>();
    i.add(1);
    i.add(2);
    i.add(1);  
    i.add(2);
    i.add(2);
    i.add(2);
//   System.out.println("Before deleting duplicates " +i);
//   for(int j=0;j<i.size();j++)
//   {
//	   int d=i.get(j);
//	  
//	   for(int k=j+1;k<i.size();k++)
//	   {
//		   if(d==i.get(k))
//		   {
//			   i.set(k,-1);
//		   }
//		   
//	   }
//   }
//   System.out.println("After deleting duplicates");
//   for(int l:i)
//   {
//	   if(l!=-1)
//	   System.out.print(l+" ");
//   }
//  ArrayList<Integer> i1=new ArrayList<Integer>();
//   i1.add(1);
//   i1.add(2);
//   i1.add(1);
//   i1.add(2);
//   i1.add(2);
//  i1.add(6);
//  i1.add(6);
//   for(int j=0;j<i1.size();j++)
//   {
//	   int d=i1.get(j);
//	  
//	   for(int k=j+1;k<i1.size();k++)
//	   {
//		   if(d==i1.get(k))
//		   {
//			   System.out.println("in if");
//			   i1.remove(k);
//		   }
//		   
//	   }
//   }
//   for(int h:i1)
//   {
//	   System.out.print(h+" ");
//   }
    System.out.println(i.size());
    Iterator<Integer> itr11=i.iterator();
    int l,k;
   for(int j=0;j<i.size();j++)
   {
	   l=j+1;
	   k=i.size();
	   if(l<k)                     //1 2 1 2 2
	   {                           //1 2 2 2
		                           //1 2 2
	   while(itr11.hasNext())
	   {
		   if(i.get(j)==i.get(l))
		   {
			   i.remove(l);
			   l--;
			   k=i.size();
		   }
		   l++;
		   if(l<k)
		   {
			   System.out.println("  hii");
			   continue;
		   }
		   else
		   {
			   break;
		   }
	   }
	   }
   }
   System.out.println(i);
	}

}
