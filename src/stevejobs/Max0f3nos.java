package stevejobs;

import java.util.Scanner;

public class Max0f3nos 
{

	public static void main(String[] args) 
	{
		//program to print the max of 3 numbers
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		  a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("enter c:");
		 c=sc.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("a is big number");
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println("b is big number");
		 }
		 else
		 {
			 System.out.println("c is big number");
		 }
		
		

	}

}
