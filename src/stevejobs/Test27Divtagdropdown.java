package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test27Divtagdropdown {
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	      //AUTOMATE DROPDOWN WHICH DOESNT CHAR MATCHING
	       WebElement e1=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
	       Actions a=new Actions(driver);
	       a.click(e1).build().perform();
	       Thread.sleep(3000);
	       for(int i=1;i<=2;i++)
	       {
	    	   a.sendKeys(Keys.DOWN).build().perform();
	    	   Thread.sleep(2000);
	       }
	       a.sendKeys(Keys.ENTER).build().perform();

	}

}
