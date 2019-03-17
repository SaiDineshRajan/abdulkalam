package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test28draganddropby {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/slider/");
		 Thread.sleep(3000);
		 driver.switchTo().frame(0);
		 WebDriverWait w=new WebDriverWait(driver,10);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")));
		 driver.manage().window().maximize();
		 WebElement e1=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]"));
		 Actions a=new Actions(driver);
		 int x=e1.getLocation().getX();
		 int y=e1.getLocation().getY();
		 //SLIDE FROM LEFT TO RIGHT
		 a.dragAndDropBy(e1, x+300, y).build().perform();
		 //SLIDE FROM RIGHT TO LEFT
		 a.dragAndDropBy(e1, x-150 , y).build().perform();
		 driver.switchTo().defaultContent();
		 //SLIDE VERTICAL SLIDER 
		 driver.findElement(By.linkText("Vertical slider"));
		 
				 
			                      
			                         
		 

	}

}
