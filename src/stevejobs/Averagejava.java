package stevejobs;

import java.util.Scanner;

public class Averagejava {

	public static void main(String[] args) 
	{
		int a,b,sum;
		float avg;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number :");
		a=sc.nextInt();
		System.out.println("enter second number : ");
		b=sc.nextInt();
		//calculate sum and average 
		sum=a+b;
		avg=(float)((a+b)/2);
		System.out.println("sum : " +sum +"\nAverage : " +avg);	
	}

}
