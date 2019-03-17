package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselectdropdown {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.name("country"));
		Thread.sleep(3000);
		Select s=new Select(e);
		Thread.sleep(3000);
		s.selectByVisibleText("INDIA ");
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
