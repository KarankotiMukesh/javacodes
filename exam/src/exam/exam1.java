package exam;
import java.util.*;
public class exam1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       String [] a=new String[5];
       for(int i=0;i<5;i++)
       {
    	   a[i]=sc.nextLine();
       }
       TreeSet<String >ts=new TreeSet<String>();
       for(int i=0;i<5;i++)
       {
    	   ts.add(a[i]);
       }
       System.out.println(ts);
	}

}
