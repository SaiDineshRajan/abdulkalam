
public class SingleTon
{	
	public int x;
	//it will have a private constructor
	private SingleTon()
	{
		x=675;
	}
	public int y;
	private SingleTon(int temp)
	{
		y=3456;
	
	}

	//operational methods
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println("hello hai everyone");
	}
//static method to return object
	public static SingleTon create()
	{
		SingleTon s= new SingleTon();
		return(s);
	}
}
