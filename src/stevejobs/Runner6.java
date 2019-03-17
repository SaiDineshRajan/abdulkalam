package stevejobs;

public class Runner6 
{
public static void main(String[] args)
{
	//create object to abstract class
	Sample8 obj1=new Sample9();
	int a=obj1.add(10, 14);
	int b=obj1.subtract(25, 1);
	System.out.println(a);
	System.out.println(b);
	
	//create object to concrete class
	Sample9 obj3=new Sample9();
	int c=obj3.subtract(50, 26);//body in sample8
	int d=obj3.add(0, 24);
	System.out.println(c);
	System.out.println();
		
	}

}
