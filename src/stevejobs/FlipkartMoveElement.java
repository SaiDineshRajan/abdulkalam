package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMoveElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		   
		  driver.get("https://www.flipkart.com");
		  Thread.sleep(2000);
		  //CLOSE BANNER IF IT EXISTS
		  if(driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).isDisplayed());
		  {
			  driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
				  
	}
		  //MOVE MOUSE POINTER TO REQUIRED ELEMENT
		  WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
		  Actions a=new Actions(driver);
		  a.moveToElement(e).build().perform();
		  

}

}