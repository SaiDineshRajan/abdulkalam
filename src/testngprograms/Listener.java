package testngprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testlisteners.class)
public class Listener 
{
public WebDriver driver;
  @Test(priority=0)
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.co.in");
	  
	  
	  
  }
  @Test(priority=1,dependsOnMethods={"launch"})
  public void search()
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar",Keys.ENTER);
	  String x=driver.getTitle();
	  if(x.contains("Dinesh"))
	  {
		  Reporter.log("test passed");
	  }
	  else
	  {
		  Reporter.log("test failed");
	  }
	  
	  
	  
  }
  @Test(priority=2,dependsOnMethods= {"search"})
  public void close()  
  {
	  driver.close();
  }
  
  
}
