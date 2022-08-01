package com.shape;

/*Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named area() and perimeter(). Create these using polymorphism concepts.
*/
import java.util.*;
public class Shape1 {

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
     System.out.println("please select any shape: circle or triangle or square  ");
     String s=sc.next();
     if(s.equals("circle"))
     {
    	 double m,o;
    	 Class2 obj=new Circle();
    	 System.out.println("please enter radius:");
    	 double n=sc.nextDouble();
    	m= obj.area( n);
    	System.out.println("area is : "+m);
    	o=obj.perimeter(n);
    	System.out.println("perimeter is: "+o);
    	 
     }
     else if(s.equals("triangle"))
     {
    	 double m,o;
    	 Class2 obj=new Triangle();
    	 System.out.println("please enter base:");
    	 double n=sc.nextDouble();
    	 System.out.println("please enter height:");
    	 double e=sc.nextDouble();
    	 System.out.println("please enter width:");
    	 double b=sc.nextDouble();
    	m= obj.area( n,e);
    	System.out.println("area is : "+m);
    	o=obj.perimeter(n,e,b);
    	System.out.println("perimeter is: "+o);
    	 
     }
     else if(s.equals("square"))
     {
    	 double m,o;
    	 Class2 obj=new Triangle();
    	 System.out.println("please enter side:");
    	 double n=sc.nextDouble();
    	m= obj.area( n);
    	System.out.println("area is : "+m);
    	o=obj.perimeter(n);
    	System.out.println("perimeter is: "+o);
    	 
     }
     else
     {
    	 System.out.println("please choose from circle or triangle or square");
     }
	}

}
