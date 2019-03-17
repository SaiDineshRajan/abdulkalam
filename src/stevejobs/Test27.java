package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test27 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.linkText("JAVASCRIPT"));
		String x=e1.getAttribute("title");
		System.out.println(x);
		//SCROLL TO A SPECIFIC ELEMENT IN PAGE
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e2=driver.findElement(By.xpath("//*[text()='Demo: Tooltip Examples']"));
         js.executeScript("arguments[0].s56crollIntoView();",e2);
		Thread.sleep(5000);
		//MOVE MOUSE POINTER TO ELEMENT FOR TOOLTIP VISIBILITY
		WebElement e3=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(e3).clickAndHold().build().perform();
		Thread.sleep(3000);
		WebElement e4=driver.findElement(By.xpath("(//*[@class='tooltip'])/span"));
		String y=e4.getText();
		System.out.println(y);
		a.release().build().perform();
		
		
		
	}

}
