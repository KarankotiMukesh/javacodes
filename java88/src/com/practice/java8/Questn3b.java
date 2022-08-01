package com.practice.java8;

/*
 * Ques 3. a).what is funtional interface ? Give an example b). Can a functional interface extend/inherit another interface? 
 * Explain it and Give an example for both cases.
 */

public interface Questn3b {
	void method1();

}
 interface A1 extends Questn3b{
	 default void method2() {
		 System.out.println("this is default method");
		 
	 }
 }
 class B implements A1{
	 
	 public void method1() {
		 System.out.println("hii this is yours code");
	 }
	
	
	}
 
