import java.util.Scanner;

public class PlindrSravan {

	public static void main(String[] args)
	{
	   String rev="";
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a word");
	   String s=sc.nextLine();
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   rev=rev+s.charAt(i);
	   }
	   if(s.equals(rev))
	   {
		   System.out.println("it is a palindrome");
	   }
	   else
	   {
		   System.out.print("It is not a palindrome");
	   }
	   
	}

}
