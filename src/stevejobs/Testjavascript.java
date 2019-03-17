package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testjavascript {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  Thread.sleep(5000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  Thread.sleep(3000);
		  js.executeScript("document.getElementById('email').value='dinesh.rajan47475@gmail.com';" );
		  Thread.sleep(2000);
		  driver.close();
	}
	
	
	

}
