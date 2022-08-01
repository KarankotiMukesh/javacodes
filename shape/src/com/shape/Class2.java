package com.shape;


/*Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named area() and perimeter(). Create these using polymorphism concepts.
*/
public class Class2 {
	public double area(double r)
	{
		return r*r;
	}
	public double area(double b,double h)
	{
		return b*h;
	}
	public double perimeter(double r)
	{
		return r;
	}
	public double perimeter(double  a,double b,double c)
	{
		return a+b+c;
	}

}
 class Circle extends Class2
 {
	 double n,m;
	 public double area(double r)
	 {
		 n=super.area(r);
		 n=3.14*n;
		 return n;
	 }
	 public double perimeter(double r)
	 {
		 m=super.perimeter(r);
		 m=2*3.14*m;
		 return m;
	 }
 }
 class Triangle extends Class2
 {
	 double n,m;
	 public double area(double r,double h)
	 {
		 n=super.area(r,h);
		 n=0.5*n;
		 return n;
	 }
	 public double perimeter(double r,double b,double c)
	 {
		 m=super.perimeter(r,b,c);
		 
		 return m;
	 }
 }
 class Square extends Class2
 {
	 double n,m;
	 public double area(double r)
	 {
		 n=super.area(r);
		 return n;
	 }
	 public double perimeter(double r)
	 {
		 m=super.perimeter(r);
		 m=m*4;
		 return m;
	 }
 }
 
