import java.util.Scanner;

public class Duplicate_char_in_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			for(int j=i+1;j<x.length();j++)
			{
				if(x.charAt(i)==x.charAt(j))
				{
					System.out.println(x.charAt(j));
			}
			}
		}


	}

}
