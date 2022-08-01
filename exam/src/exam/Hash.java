package exam;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Hash {

	public static void main(String[] args) {
//		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
//		
//		h.put(101,"Mukesh");
//		h.put(102,"Mukki");
//		//h.put(103,null);
//		h.put(102,"Mu");
//		
//		System.out.println(h);
//		
//		
//		HashMap<Integer,String> hm=new HashMap<Integer,String>();
//		hm.put(101,"mukesh");
//		hm.put(102,"mukki");
//		hm.put(103,null);
//		hm.put(101,"mu");
//		System.out.println(hm);
		
HashMap<String,Integer>SlotBadminton=new HashMap<String, Integer>(10);
String s="";
for(int i=1;i<=10;i++)
{
	if(SlotBadminton.containsValue(i))
	{
		continue;
	}
	else
	{
		
		s=s+String.valueOf(i)+" ,";
	}
}
System.out.println(s);
      
	}
	

}
