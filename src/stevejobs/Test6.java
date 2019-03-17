package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.findElement(By.name("email")).sendKeys("dinesh.rajan47475@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("ilovelordshiridisairam");
	  driver.findElement(By.id("loginbutton")).click();
      driver.close();
	} 
}
