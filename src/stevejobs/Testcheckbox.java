package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcheckbox {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		   
		  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_checkbox");
		  driver.switchTo().frame("iframeResult");
		  Thread.sleep(5000);
          WebElement e1=driver.findElement(By.xpath("//*[@value='Bike']"));
          Actions a=new Actions(driver);
          a.click(e1).build().perform();
          
          WebElement e2=driver.findElement(By.xpath("//*[@value='Car']"));
          a.click(e2).build().perform();
          Thread.sleep(5000);
          driver.switchTo().defaultContent();
          driver.close();
	}

}
