package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testattribute {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.instagram.com");
	      String x=driver.findElement(By.name("username")).getCssValue("text-align");
	      System.out.println(x);
	      driver.close();
	      


	}

}
