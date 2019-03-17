package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(Testlisteners.class)
public class Test138ng 
{
	public WebDriver driver;
	public WebDriverWait wait;;
	@Test(priority=0)
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
    }
	
      @Test(priority=1)
       public void search()
       {
    	  driver.findElement(By.name("identifier")).sendKeys("dineshrajanbodapati");
    	 wait=new WebDriverWait(driver,20);
    	  driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
    	  driver.findElement(By.name("password")).sendKeys("9703097999");
    	  driver.findElement(By.xpath("//*[text()='Next']")).click();
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
    	  driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account: Dinesh Rajan')]")).click();
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sign out']")));
    	  driver.findElement(By.xpath("//*[text()='Sign out']")).click();
    	  
        }
      @Test(priority=2)
      public void close()
      {
    	  driver.close();
      }
}
