package com.practice.Q1;


/*
 * 1. Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)

 */


class Employee{
	private String name;
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname() 
	{
		return name;
	}
}
class Company{
	String Rating;
	String startYear;
	String company;
	
	public void setRating(String rating)
	{
		this.Rating=rating;
	}
	public String getrating()
	{
		return Rating;
	}
	public void setYear(String year) {
		
		this.startYear=year;
	}
	public String getYear()
	{
		return startYear;
	}
	public void setcompany(String company)
	{
	  
		this.company=company;
	}
	public String getcompany()
	{
		return company;
	}
}



public class Question1 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		Company obj1=new Company();
		obj.setname("Mukesh");
		obj1.setRating("4.0");
		obj1.setYear("2022");
		obj1.setcompany("techouts");
		
		
		System.out.println(obj.getname()+" is working in "+ obj1.getcompany()+" since " + obj1.getYear()+" and his rating is "+ obj1.getrating());
		

	}

}
