import java.util.Scanner;

public class Max_numbers_in_Array {

	public static void main(String[] args)
	{
		int x[]=new int[5];
		int max=x[0];
		int min=x[0];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the "+(i+1)+"number");
			x[i]=sc.nextInt();
		}
		for(int i=0;i<x.length;i++)
		{
			if(min>x[i])
			{
				min=x[i];

			}
			
		}
		System.out.println("maximum number" +min);
	}

}
