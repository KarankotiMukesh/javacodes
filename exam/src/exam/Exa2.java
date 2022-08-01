package exam;
import java.text.SimpleDateFormat;
import java.util.*;
public class Exa2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
/*try
		{
			System.out.println("enter date");
		     String s=sc.next();
		 
		SimpleDateFormat da=new SimpleDateFormat("dd-mm-yy");
		
      Date d1=da.parse(s);
      da.format(d1);
      System.out.println(d1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
*/
