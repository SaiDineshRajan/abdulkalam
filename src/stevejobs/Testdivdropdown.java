package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testdivdropdown {
public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	   
	  driver.get("https://semantic-ui.com/modules/dropdown.html");
	  	Thread.sleep(5000);
	  	//OPEN DROP DOWN BY CLICKING
        WebElement e=driver.findElement(By.xpath("//*[text()='Select Friend']"));
        Actions a=new Actions(driver);
        a.click(e).build().perform();
        Thread.sleep(2000);
       //COLLECT ITEMS IN DROP DOWN
        List<WebElement> il=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
        Thread.sleep(2000);
        for(int i=0;i<il.size();i++)
        {
        	String x=il.get(i).getAttribute("data-value");
        	Thread.sleep(2000);
        	System.out.println(x);
        	
        }
        	driver.close();
        	
        		
	}

}
