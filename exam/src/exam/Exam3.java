package exam;
import java.util.*;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String [] ar=new String[s.length()];
	
		for(int i=0;i<s.length();i++)
		{
			ar[i]="1";
		}
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ar[i]!="-1")
				{
				if(s.charAt(i)==s.charAt(j))
				{
					ar[j]="-1";
				}
				
		     	}
			}
		}
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=="1")
			{
				sum++;
			}
		}
		System.out.println(sum);
	}

}
