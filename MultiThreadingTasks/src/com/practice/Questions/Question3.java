package com.practice.Questions;

/*
 * 3. Display all the properties of running threads. Create 3 threads and rename thread1 to "yourName" and make
 *  this thread a daemon thread.Get the updated thread details.

 */
public class Question3 extends Thread {
	public void run()
	{
		System.out.println(" hii");
	}

	public static void main(String[] args) {
		
		Question3 obj1=new Question3();
		Question3 obj2=new Question3();
		Question3 obj3=new Question3();
		obj1.setName("mukesh");
		obj1.setDaemon(true);
		System.out.println(obj1.isDaemon());
		obj1.start();
		
		
		System.out.println("updated thread is: "+obj1.getName());
		System.out.println(obj2.getName());
		System.out.println(obj3.getName());

	}

}
