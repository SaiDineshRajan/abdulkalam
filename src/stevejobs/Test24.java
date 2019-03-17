package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test24 {

	public static void main(String[] args) throws InterruptedException
	{
	      ////AUTOMATE DROPDOWN IN <DIV> TAG 
		{
			 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
			  ChromeDriver driver=new ChromeDriver();
			   
			  driver.get("https://semantic-ui.com/modules/dropdown.html");
			  	Thread.sleep(5000);
			  		WebElement e1=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
			  		Actions a=new Actions(driver);
			  		a.click(e1).build().perform();
			  		Thread.sleep(5000);
			  		for(int i=1;i<=3;i++)
			  		{
			  			a.sendKeys(Keys.DOWN).build().perform();
			  		}
		           a.sendKeys(Keys.ENTER).build().perform();
		           
	}

	}
}