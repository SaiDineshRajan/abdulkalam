import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) throws Exception
	{
         ArrayList<String> a=new ArrayList<String>();
        System.out.println("enter word");
         Scanner sc=new Scanner(System.in);
         int x=Integer.parseInt(sc.nextLine());
         System.out.println("Enter Test Data"+x+"");
         for(int i=0;i<x;i++)
         {
        	 System.out.println("search");
        	 a.add(sc.nextLine());
        	 
         }
         for(int i=0;i<x;i++)
         {
        	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        	 ChromeDriver driver=new ChromeDriver();
        	 driver.get("http://www.google.com");
        	 driver.findElement(By.name("q")).sendKeys(a.get(i));
        	 Thread.sleep(5000);
        	 driver.close();
         }
         
         

	}
}
