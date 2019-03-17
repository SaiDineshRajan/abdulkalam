import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTxt {

	public static void main(String[] args) throws Exception
	{
	    System.setProperty("webdriver.chrome.driver","ChromeDriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://www.way2sms.com/");
	    if(driver.findElement(By.xpath("//*[text()='Register Now']")).isDisplayed())
	    {
	    	 String z=driver.findElement(By.xpath("//*[@class='hero-txt align-center']")).getText();
	 	    System.out.println(z);
	    }
	    else
	    {
	    	System.out.println("Text is not there");
	    }
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   String v= driver.findElement(By.id("mobileNo")).getAttribute("onkeypress");
	   System.out.println(v);
	   Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@href='https://www.instagram.com/way2sms_official/?hl=en']")).click();
	  driver.findElement(By.xpath("//*[@class='icon-f-twitter']")).click();

	  ArrayList<String> d=new ArrayList(driver.getWindowHandles());
	  for(int i=0;i<d.size();i++)
	  {
		  System.out.println(i);
	  }

	 
	  driver.switchTo().window(d.get(2));
//	  WebDriverWait w=new WebDriverWait(driver,10);
//	  Actions a=new Actions(driver);
//	  w.until(ExpectedConditions.visibilityOfElementLocated(By.id("global-nav-search")));
//	  WebElement s=driver.findElement(By.id("global-nav-search"));
//	  a.moveToElement(s).build().perform();
//	  a.sendKeys(" God intoxicated").build().perform();
//	  Thread.sleep(10000);
	  driver.close();
	  driver.switchTo().window(d.get(1));
//	  driver.findElement(By.xpath("(//*[text()='Log In'])[2]")).click();
	  driver.close();
	  driver.switchTo().window(d.get(0));
//	  driver.findElement(By.id("mobileNo")).sendKeys("9703097999");
	 driver.close();
	  
  
	  
	  
	  
	 
	 
	   
	}

}
