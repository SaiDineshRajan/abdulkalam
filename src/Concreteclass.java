
public class Concreteclass implements Interface
{

	@Override
	public int add(int x, int y)
	{
		int z;
		 z=x+y;
		return(z);
	}

	@Override
	public int subtract(int x, int y)
	{
		int z;
		z=x-y;
		return(z);
	}
     
}
