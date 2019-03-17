package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscrolling {

	public static void main(String[] args) throws InterruptedException
	{
		//SCROLLING WEBPAGE TO BOTTOM,TOP TO BOTTOM,TO A SPECIFIC ELEMENT
		 System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver(); 
         driver.get("https://www.semantic-ui.com/modules/dropdown.html");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         //SCROLL TO BOTTOM
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
         Thread.sleep(3000);
         //SCROLL TO Top
         js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
         Thread.sleep(3000);
         //Scroll to a specific element in page
         WebElement e=driver.findElement(By.xpath("//*[text()='Select Country']"));
         Thread.sleep(3000);
         Thread.sleep(3000);
         js.executeScript("arguments[0].scrollIntoView();",e);
         Thread.sleep(2000);
         driver.close();
         
	}

}
