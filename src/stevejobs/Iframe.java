package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.w3schools.com/jsref/dom_obj_frame.asp");
	      Thread.sleep(3000);
	      //driver.navigate().to("https://www.w3schools.com/jsref/dom_obj_frame.asp");
	      Thread.sleep(5000);
	     // driver.switchTo().frame(e);
	      WebElement e=driver.findElement(By.xpath("//*[@onclick='myFunction()']"));
	      driver.switchTo().frame(e);
	      //driver.switchTo().frame(e);
	      Thread.sleep(3000);
	      String x=driver.getCurrentUrl();
	      System.out.println(x);
	      
	      

	}

}
