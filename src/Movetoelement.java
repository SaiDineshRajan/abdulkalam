import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Movetoelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		if(driver.findElement(By.xpath("(//span[text()='Login'])[1]")).isDisplayed())
				{
					driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9703097999");
					  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("9703097999");
						driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				}
		try
		{
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'TVs & Appliances')]")));
		Actions a=new Actions(driver);
		
		WebElement e=driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
		a.moveToElement(e).build().perform();
		a.click(e).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		

}
}
