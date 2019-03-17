package stevejobs;

public class Methodoverloading {

	
		int a;
		public void add(int x,int y,int z)
		{
		  a=(x+y+z);
		}
		int r;
		public void add(int p,int q)
		{
		    r=p+q;
			
		}
		public void display()
		{
			System.out.println(a);
			System.out.println(r);
		}
	
}
