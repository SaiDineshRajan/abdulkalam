import java.util.Scanner;

public class Averages_sum {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int x=sc.nextInt();
	System.out.println("Enter second number");
	int y=sc.nextInt();
	//sum of two numbers
	int z=x+y;
	float avg=(z/2);
	System.out.println(z+"\t sum of two numbers"+"\n"+avg+"\t avg of two numbers");


	}

}
