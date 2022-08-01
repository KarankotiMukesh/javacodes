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
public class Box1 {
	private int length;
	private int breadth;
	private int height;
	Box1(int l,int b,int h)
	{
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	public void area()
	{
		int ans;
		ans=2*(length*breadth+breadth*height+height*length);
		System.out.println("the are of cube is: "+ans);
	}
	public void volume()
	{
		int ans;
		ans=length*breadth*height;
		System.out.println("the volume of cube is: "+ans);
	}

}
class Box3d extends Box1
{

	Box3d(int l, int b, int h)
	{
		super(l, b, h);
		
	}
	
}
