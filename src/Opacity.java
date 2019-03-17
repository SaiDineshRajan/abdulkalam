import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opacity 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement e=driver.findElement(By.linkText("Gmail"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(10000);
		String x=e.getCssValue("opacity");
		System.out.println(x);
	}

}
