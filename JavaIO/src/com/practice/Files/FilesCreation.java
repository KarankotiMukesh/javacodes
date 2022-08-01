package com.practice.Files;
import java.io.File;
import java.io.IOException;  
import java.nio.file.Files;

public class FilesCreation {

	public static void main(String[] args) {
		
		File obj=new File("D:\\JavaIO\\CreatingFiles.txt");
		
		try
		{
			boolean a=obj.createNewFile();
			if(a)
			{
				System.out.println("file was created successfully");
			}
			else
			{
				System.out.println("file was not created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
