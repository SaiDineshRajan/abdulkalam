import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String x=sc.nextLine();
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;
		}

		if(y.equals(x))
		{
			System.out.println(y+"  is not a palindrome");
		}
		else
		{
			System.out.println(y+"  is not a palindrome");
		}


		


	}

}
