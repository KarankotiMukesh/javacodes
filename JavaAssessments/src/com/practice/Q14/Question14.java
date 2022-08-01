package com.practice.Q14;

import java.io.IOException;

/*
 * 14. Employee has methods for create, read and write to a file.
	Manager extends employer and have these file methods overriden
	(Examine here without handling the exceptions) along with delete the file.
 */

public class Question14 {

	public static void main(String[] args) throws IOException {
		
          Manager obj=new Manager(101,"2022","4.0");
          obj.create();
          obj.write();
          obj.read();
	}

}
