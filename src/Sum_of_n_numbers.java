import java.util.Scanner;

public class Sum_of_n_numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int temp=0;
		for(int i=0;i<=x;i++)
		{
			temp=temp+i;
		}
		System.out.println("sum of "+x+" is "+temp);
	}

}
