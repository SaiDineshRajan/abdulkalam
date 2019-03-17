package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) 
	{ 
		// TO FIND NUMBER OF TEXTBOXES
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	      driver.manage().window().maximize();
	      int e=driver.findElements(By.xpath("//input[@type='text']")).size();		   
	      int d=driver.findElements(By.xpath("//input[@type='password']")).size();
	      System.out.println(e);
	      System.out.println(d);
	      driver.close();
	    
	   

	}

}
