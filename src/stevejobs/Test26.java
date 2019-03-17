package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test26 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
