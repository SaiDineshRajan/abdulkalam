 package testngprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Testlisteners.class)
public class NewGoogle
{
	public WebDriver driver;
	@Test(priority=0)
	  public void launch() throws Exception
	  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver=new ChromeDriver();
		  Thread.sleep(4000);
		  driver.get("http://www.google.co.in");
		  
		  
	  }
	  @Test(priority=1)
	  @Parameters({"searchword"})
	  public void search(String x)
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		  String y=driver.getTitle();
		  if(y.contains("Dinesh"))
		  {
			  Reporter.log("test passed");
		  }
		  else
		  {
			  Reporter.log("test failed");
		  }
		 		  
	  }
	  @Test(priority=2)
	  public void close()  
	  {
		  driver.close();
	  }
	  
}
