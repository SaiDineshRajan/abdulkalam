import java.util.Scanner;

public class Fibonacci1 
{
	public static void main(String[] args) 
	{
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a value");
          int a=sc.nextInt();
          int x=0;
          int y=1;
          System.out.println(x+" "+"\n"+y+" ");
          int z=x+y;
          while(z<=a)
          {
        	  System.out.println(z+" ");
        	  x=y;
        	  y=z;
        	  z=x+y;
          }
	}
}
 