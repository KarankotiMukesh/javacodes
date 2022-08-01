package com.practice.serlization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serliz1 {

	public static void main(String[] args) {
		
		Serliz2 a=new Serliz2(102,"mukki","techouts");
		
		try {
			FileOutputStream out=new FileOutputStream("D:\\Serilize\\Second serealizable.txt");
			ObjectOutputStream put=new ObjectOutputStream(out);
			put.writeObject(a);
			put.close();
			out.close();
			System.out.println("successfully written in text file");
		}
		catch(IOException e){
			System.out.println(e);
			
		}
	}

}
