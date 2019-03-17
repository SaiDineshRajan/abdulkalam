package stevejobs;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER BROWSER NAME");
		String x=sc.nextLine();
		WebDriver driver=null;
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\batch239\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("WRONG BROWSER");
			System.exit(0);
		}
		  driver.get("https://www.google.com/");
		  
	}
	
}
	
     