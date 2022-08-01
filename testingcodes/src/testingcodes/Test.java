package testingcodes;


import java.util.Scanner;

enum Day{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY;
}
class Test{
	Day day;
	public Test(Day day)
	{
		this.day=day;
	}
	public void isLike()
	{
		
	
	switch(day)
	 {
	case MONDAY:
		System.out.println("this is monday");
		break;
	case TUESDAY:
		System.out.println("this is tuesday");
		break;
	 default:
		System.out.println("rest of the day");break;
	 }
	}
	public static void main(String[] args) {
		
		String s="MONDAY";
		Test t=new Test(Day.valueOf(s));
		t.isLike();
	}
}
