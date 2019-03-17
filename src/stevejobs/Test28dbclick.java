package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test28dbclick {
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
	Thread.sleep(3000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
	Actions a=new Actions(driver);
	Thread.sleep(3000);
	a.doubleClick(e).build().perform();
	
	

	}

}
