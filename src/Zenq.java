
public class Zenq {

	public static void main(String[] args) 
	{
	 int x[]= {12,15,89,24,66};
	 int y[]= {45,89,24,77,12};
	 int z=0;
	 for(int i=0;i<x.length;i++)
	 {
		 for(int j=0;j<y.length;j++)
		 {
			 if(x[i]==y[j])
			 {
				 System.out.println("common integer is "+y[j]);
				 				 z=z+y[j];
				 				 
			 }
		 }
	 }
	        System.out.println("sum of duplicate values is:"+z);

	}

}
