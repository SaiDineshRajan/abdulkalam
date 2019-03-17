package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver(); 
          driver.get("http://www.google.co.in");
          driver.findElement(By.name("q")).sendKeys("newtours demoaut",Keys.TAB,Keys.ENTER);
          driver.findElement(By.linkText("Newtours - Demoaut.com")).click();
          driver.findElement(By.name("userName")).sendKeys("apj@abdulkalam",Keys.TAB,"batch239sleepers",Keys.ENTER);
          String x=driver.getCurrentUrl();
          System.out.println(x);
          

	}

}
