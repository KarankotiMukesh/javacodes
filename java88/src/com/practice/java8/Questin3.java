package com.practice.java8;

/*
 * Ques 3. a).what is funtional interface ? Give an example b). Can a functional interface extend/inherit another interface? 
 * Explain it and Give an example for both cases.
 */
public interface Questin3 {
	void method();

}
class A implements Questin3{
	public void method()
	{
		System.out.println("this is abstract method");
	}
}
