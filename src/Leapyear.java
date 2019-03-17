import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an year");
		int x=sc.nextInt();
		if((x%400==0)||(x%4==0 && x%100!=0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}

	}

}
