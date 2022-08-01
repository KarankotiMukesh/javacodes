package box;

/*
 5)Create class box and box3d. box3d is extended class of box. The above
two classes going to pull fill following requirement
 Include constructor.
 set value of length, breadth, height
 Find out area and volume.
Note: Base class and sub classes have respective methods and instance
variables.
 */
import java.util.*;
public class Box {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int o=sc.nextInt();
		Box1 obj=new Box3d(n,m,o);
		obj.area();
		obj.volume();

	}

}
