package com.practice.serlization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserealizable {

	public static void main(String[] args) throws ClassNotFoundException {
		Serliz2 a=null;
		
		try {
			FileInputStream i=new FileInputStream("D:\\Serilize\\Second serealizable.txt ");
			ObjectInputStream ob=new ObjectInputStream(i);
			a=(Serliz2) ob.readObject();
            ob.close();
            i.close();
	}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("successfully taken details from text file they are: ");
			System.out.println(a.roll+ " "+ a.name+" "+a.company);
			
		}

}
}
