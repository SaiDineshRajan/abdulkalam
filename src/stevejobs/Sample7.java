package stevejobs;

public class Sample7 implements Sample6 //concrete class
{
    //method bodies to method declarations in Samole6(interface)
	
	public int add(int x, int y) 
	{
		int z;
		z=x+y;
		return(z);
	}

	public int subtract(int x, int y) 
	{
		int z;
		z=x-y;
		return (z);
	}
   
}
