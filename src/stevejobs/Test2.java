package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 { 
	public static void main(String[] args)
	{

	       System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
			  ChromeDriver driver = new ChromeDriver(); 
	          driver.get("https://www.facebook.com/");
	          driver.findElement(By.name("email")).sendKeys("dinesh.rajan47475@gmail.com");
	         // driver.findElement(By.name("email")).clear();
	          String x=driver.getTitle();
	          System.out.println(x);
	          String y=driver.getPageSource();
	          System.out.println(y);
              driver.close();
}
}