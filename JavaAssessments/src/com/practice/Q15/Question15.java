package com.practice.Q15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * 15. Write the details of Employee class to a file in your local and make this 
 * file non-editable.
 */


class Employee{
	int id;
	String name;
	String address;
	
	Employee(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
		
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + "";
	}
	
	
	
	
}




public class Question15 {

	
	public static void main(String[] args) throws IOException {
		try
		{
      PrintWriter pw=new  PrintWriter("D:\\\\JavaIO/Question3.txt");
		File f=new File("D:\\JavaIO/Question3.txt ");
		f.createNewFile();
		
		 Employee obj=new Employee(101,"Mukesh ","Nalgonda");
		 Employee obj1=new Employee(103,"Vineeth ","Nellore");
		 Employee obj2=new Employee(102,"Pavan ","Warangal");
		 Employee obj3=new Employee(104,"Vijay ","Hyderabad");
			
		pw.println(obj);
		pw.println(obj1);
		pw.println(obj2);
		pw.println(obj3);
		
			
		
	   f.setReadOnly();
		Employee obj4=new Employee(101,"Mukesh ","Nalgonda");
		pw.println(obj4);
		pw.flush();
		pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
