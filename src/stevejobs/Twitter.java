package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		    driver.get("http://twitter.com");
		    driver.findElement(By.partialLinkText("Log in")).click();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@autocomplete='on']")).sendKeys("dineshrajan4747");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   // driver.switchTo().alert().accept();
		   String x= driver.findElement(By.xpath("//*[@class='message-text']")).getText();
		   System.out.println(x);
	}	    
		    

	

}
