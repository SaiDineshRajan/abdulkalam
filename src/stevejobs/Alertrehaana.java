package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertrehaana {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		List<WebElement> l=driver.findElements(By.xpath("(//*[@class='ui fluid selection dropdown'])[1]/div[2]/div"));
		Thread.sleep(4000);
		System.out.println(l.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		for(int i=0;i<l.size();i++)
		{
		js.executeScript("var x=arguments[0].textContent;window.alert(x)",l.get(i));
		String y=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println(y);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		}

}

}