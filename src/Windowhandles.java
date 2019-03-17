import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandles 
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,20);
	driver.get("http://www.way2sms.com/");
	driver.findElement(By.linkText("Facebook")).click();
	driver.findElement(By.linkText("Twitter")).click();
	ArrayList<String> s=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(s.get(0));
	driver.switchTo().window(s.get(1));
	WebDriverWait w=new WebDriverWait(driver,20);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign up")));
	driver.findElement(By.linkText("Sign up")).click();
    driver.switchTo().window(s.get(2));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@role='button'])[2]")));
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	driver.findElement(By.name("firstname")).sendKeys("reehana");
	driver.findElement(By.name("lastname")).sendKeys("syed");
	driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number ')]")).sendKeys("7396978883");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("reehana7*6");
	WebElement e=driver.findElement(By.id("day"));
	Select s1=new Select(e);
	s1.selectByValue("26");
	e.click();
	WebElement e1=driver.findElement(By.id("month"));
	Thread.sleep(3000);
	s1.selectByValue("10");
	e1.click();
	WebElement e2=driver.findElement(By.id("year"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
	s1.selectByIndex(27);
	e2.click();
   // driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
    //Thread.sleep(5000);
  
}
	
}
