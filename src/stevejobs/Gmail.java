package stevejobs; 

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gmail {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
/*		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.name("firstName")).sendKeys("abcdef");
		driver.findElement(By.name("lastName")).sendKeys("ghij");
		driver.findElement(By.id("username")).sendKeys("aghij534");
		driver.findElement(By.name("Passwd")).sendKeys("dinesh123@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("dinesh123@");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		*/
		
		

	}

}