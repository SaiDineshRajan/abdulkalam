import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	  //Declare 8 string array
		String x[]=new String[8];
		//Fill Array with 8 Strings
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter "+(i+1)+"word");
			x[i]=sc.nextLine();
		}
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<7;j++)
			{
				if (x[j+1].compareToIgnoreCase(x[j])>0)
				{
					String temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					
				}
			}
			
		}
		//display array strings after sorting
		for(int i=0;i<8;i++)
		{
			System.out.print(x[i]+" ");
		}
		
	}

}
