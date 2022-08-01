package com.practice.Q2;

/*
 * 2. Implement many-many association for Trainee and StudyMaterial.

 */

class Trainee{
	
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String  getName()
	{
		return name;
	}
}
class StudyMaterial{
	
	
	private String material1;
	private String material2;
	
	public void setMaterial1(String material1)
	{
		this.material1=material1;
	}
	public String  getMaterial1()
	{
		return material1;
	}
	public void setMateraial2(String material2)
	{
		this.material2=material2;
	}
	public String getMaterial2()
	{
		return material2;
	}
	
}



public class Question2 {

	public static void main(String[] args) {
		

		Trainee obj=new Trainee();
		StudyMaterial obj1=new StudyMaterial();
		obj.setName("mukesh");
		obj1.setMaterial1("GeekForGeeeks");
		obj1.setMateraial2("JavaTPointer");
		
		
		System.out.println(obj.getName()+ "  learns from "+ obj1.getMaterial1()+" and also he learns from "+ obj1.getMaterial2());
	}

}
