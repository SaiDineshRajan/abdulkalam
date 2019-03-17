package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21 {

	public static void main(String[] args) throws InterruptedException 
	{
		//DRAG AND DROP BY (HORIZONTAL SLIDER)
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
	     Thread.sleep(1000);
	   //  driver.switchTo().frame(0);
	     Actions a=new Actions(driver);
		 /* WebElement e1=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));
		  
		  int x=e1.getLocation().getX();
		  int y=e1.getLocation().getY();
		   //SLIDE FROM LEFT TO RIGHT
		  a.dragAndDropBy(e1,x+200,y).build().perform();
		  Thread.sleep(5000);
		  //SLIDE FROM RIGHT TO LEFT
		  a.dragAndDropBy(e1, x-200, y).build().perform();
		  driver.switchTo().defaultContent();*/

		  driver.findElement(By.linkText("Vertical slider")).click();
		  Thread.sleep(10000);

		  driver.switchTo().frame(0);
		  WebElement w=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]")); 
		  int p=w.getLocation().getX();
		  int q=w.getLocation().getY();
		  //SlIDE FROM TOP TO BOTTOM(INCREASE)
		  Thread.sleep(5000);
		  a.dragAndDropBy(w,p,q+100).build().perform();
		  Thread.sleep(1000);
		  //SLIDE FROM BOTTOM TO TOP(DECREASE)
          a.dragAndDropBy(w,p,q-300).build().perform();
		 driver.switchTo().defaultContent();
		 driver.close();
  }

}
