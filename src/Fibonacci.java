import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of numbers");
		int x=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int c=a+b;
		//dont know count of numbers
		//here we should mention that given x 
		while(c<=x)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}

	}

}
