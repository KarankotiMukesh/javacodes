package seriliazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) {
		Serlize a=new Serlize(101,"Mukesh","Hyderabad");
      
		try {
			FileOutputStream a2=new FileOutputStream("mukesh.txt");
			ObjectOutputStream out=new ObjectOutputStream(a2);
			out.writeObject(a);
			a2.close();
			out.close();
			System.out.println("successfully written in file");
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
