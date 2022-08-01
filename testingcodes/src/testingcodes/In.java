package testingcodes;

public interface In {

	default void m1()
	{
		System.out.println("mukesh");
	}
	
	public static void main(String[] args) {
		
		new In() {
		}.m1();
		
		
	}
		
	}
	

