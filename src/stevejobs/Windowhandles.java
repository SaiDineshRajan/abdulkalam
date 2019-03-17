package stevejobs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.hotkey.Keys;

public class Windowhandles {

	public static void main(String[] args) throws Exception
	{
		 DesiredCapabilities dc=new DesiredCapabilities();
         dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
         System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.way2sms.com");                 
         WebDriverWait w = new WebDriverWait(driver,15);
         driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();	
         ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(a.get(1));    
         Thread.sleep(3000);
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Artists']")));
         driver.findElement(By.xpath("//*[@href='https://support.google.com/googleplay/?p=about_play']")).click();
         driver.switchTo().window(a.get(0));
         driver.findElement(By.name("username")).sendKeys("9912847475");
         Thread.sleep(5000);
         driver.findElement(By.name("password")).sendKeys("9912847475");
    	 Thread.sleep(5000);
     	 driver.findElement(By.id("loginBTN")).click();	   
        
		
	}

}
