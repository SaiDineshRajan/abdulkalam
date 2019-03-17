package stevejobs;

public class Runner5
{

	public static void main(String[] args)
	{
       //create object to interface
		Sample6 obj1=new Sample7();
		int a =obj1.add(24, 0);
		System.out.println(a);
		
		//create object to concrete class
		Sample7 obj2=new Sample7();
		int b=obj2.subtract(48, 24);
		System.out.println(b);

	}

}
