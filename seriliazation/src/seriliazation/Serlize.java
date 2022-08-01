package seriliazation;
import java.io.*;
public class Serlize implements Serializable {
	int roll;
    String name;
    String address;
	
	
   public Serlize(int roll,String name,String address)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
}
