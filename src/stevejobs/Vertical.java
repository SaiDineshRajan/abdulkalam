package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vertical {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
	     Thread.sleep(1000);
	     Actions a=new Actions(driver);
	     driver.findElement(By.linkText("Vertical slider")).click();
	     Thread.sleep(10000);
	     driver.switchTo().frame(0);
	     WebElement e2=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));
	     int p=e2.getLocation().getX();
	     int q=e2.getLocation().getY();

	     //move top to bottom
	     a.dragAndDropBy(e2, p, q+100).build().perform();
	     Thread.sleep(10000);

	     //slide from bottom to top
	     a.dragAndDropBy(e2, p, q-200).build().perform();
	     Thread.sleep(10000);
	     driver.switchTo().defaultContent();
driver.close();


	}

}
