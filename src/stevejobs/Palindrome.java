package stevejobs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		num=sc.nextInt();
		int a=num;
		int reverse=0;
		int remainder;
		
		while(num>0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		if(reverse==a)
		{
			System.out.println("a+ is a palindrome number");
			
		}
		else
		{
			System.out.println("a+ is not a palindrome number");
		}
	
		
		
		

	}

}
