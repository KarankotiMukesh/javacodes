package com.practice.question19;

public class Que19 {
	public void Duplicate(int [] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int dup=arr[0]+1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=dup;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=dup)
			System.out.println(arr[i]);
		}
		//System.out.println(dup);
			
	}

}
