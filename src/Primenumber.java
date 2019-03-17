import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String x=sc.nextLine();
		int y=Integer.parseInt(x);
		int flag=0;
		for(int i=2;i<y;i++)
		{
			if(y%2==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
		System.out.println(x+" is a prime number");
		}
		else
		{
			System.out.println(x+" is not a prime number");
		}
	}

}
