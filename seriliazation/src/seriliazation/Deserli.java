package seriliazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserli {

	public static void main(String[] args) throws ClassNotFoundException {
		Serlize a=null;
		
		try {
			FileInputStream ob=new FileInputStream("D:\\Serilize\\Serilizable.txt");
			ObjectInputStream in=new ObjectInputStream(ob);
			
			 a=(Serlize) in.readObject();
			 in.close();
			 ob.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println(a.roll);
		}

	}

}
