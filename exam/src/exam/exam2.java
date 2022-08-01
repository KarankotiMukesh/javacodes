package exam;
import java.util.*;
public class exam2 {
  static String[] mobile= {"Samsung 8","One plus 8","Sony Experia"};
  static String[] tv= {"Vu 55 Inches","Sony Tv","Samsung Tv"};
  static String[] electronics= {"Speakers","DSLR Cameras","Security Cameras"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
		case "mobile" :
			for(int i=0;i<mobile.length;i++)
				System.out.println(mobile[i]+" ");
			break;
		case "tv":
			for(int i=0;i<tv.length;i++)
				System.out.println(tv[i]+" ");
			break;
		case "electronics":
			for(int i=0;i<electronics.length;i++)
				System.out.println(electronics[i]+" ");
			break;	
			default:
				System.out.println("No Product Available");
		}
	}

}
