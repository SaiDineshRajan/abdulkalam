package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TESTMOVEBYOFFSET {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		   
		  driver.get("https://www.flipkart.com");
		  
		  if(driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).isDisplayed());
		  {
			  driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
				  
	}
		  Actions a=new Actions(driver);
		  a.moveByOffset(100, 200);
		  Thread.sleep(5000);
		  driver.close();

	}

}
