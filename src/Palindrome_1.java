import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a value");
		        String x=sc.nextLine();
		        String y="";
		       for(int i=x.length()-1;i>=0;i--)
		       {
		    	char z=x.charAt(i);
		    	y=y+z;
		       }
		       if(x.equalsIgnoreCase(y))
		       {
		    	   System.out.println("it is a palindrome");
		       }
		       else
		       {
		    	   System.out.println("it is not a palindrome");
		       }
    }


	}


