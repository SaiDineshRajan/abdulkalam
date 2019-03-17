package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jan {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.name("q"));
		String x=e.getAttribute("class");
		System.out.println(x);
		driver.quit();
		
				
		
		
		
		
		

	}

}
