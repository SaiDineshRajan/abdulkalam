package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Textboxesgmail {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.gmail.com");
		 WebDriverWait w=new WebDriverWait(driver,20);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		 driver.findElement(By.name("identifier")).sendKeys("dineshrajanbodapati");
		 driver.findElement(By.xpath("//*[text()='Next']")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		 driver.findElement(By.name("password")).sendKeys("9703097999");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));
		 driver.findElement(By.xpath("//*[text()='Next']")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Compose']")));
		 //pagination on mailbox(Gmail)
		 int norm=0;//no of required mails
		 while(2>1)
		 {
			 List<WebElement> rl=driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
			 int noam=rl.size();
			 for(int i=0;i<noam;i++)
			 {
				 List<WebElement>cl=rl.get(i).findElements(By.tagName("td"));
				 String x=cl.get(4).getText();
				 if(x.equalsIgnoreCase("Google Photos"))
				 {
					 norm=norm+1;
				 }
			 }
				 try
				 {
					 if(driver.findElement(By.xpath("//*[@aria-label='Older']")).getAttribute("aria-disabled").equals("true"))
					 {
						 break;//stop pagination
					 }
					 
				 }
				 catch(Exception ex)
				 {
					 driver.findElement(By.xpath("//*[@aria-label='Older']")).click();
					 Thread.sleep(3000);
				 }
		 }
			 
			 System.out.println(norm);
		
		 driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/span")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
		 driver.findElement(By.linkText("Sign out")).click();
		 driver.close();
			 
			 
	
		 
		 
	}

}
