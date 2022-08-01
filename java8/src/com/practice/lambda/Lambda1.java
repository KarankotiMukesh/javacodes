package com.practice.lambda;

interface Demo{
	
	void method(int i);
	
	
}
//  class Ma implements Demo{
//	public void method(int i)
//	{
//		System.out.println("hii how are you? "+i);
//	}
//
//	
//	
//}

public class Lambda1 {

	public static void main(Str1[] args) {
		
		
		Demo obj=(i)->{
			System.out.println("hii "+i);
			
		};
		obj.method(3);
		
		
//		Demo obj=new Ma();
//		obj.method(5);
	}

}
