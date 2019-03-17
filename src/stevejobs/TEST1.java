package stevejobs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TEST1  {

	           public static void main(String[] args) throws InterruptedException 
	      {
	           System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	           DesiredCapabilities dc=new DesiredCapabilities();
	           dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
              ChromeDriver driver=new ChromeDriver();
               driver.get("http://www.way2sms.com");                 
               driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);                 
               driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();	
               ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
               driver.switchTo().window(a.get(1));    
               Thread.sleep(5000);
               driver.close();
               driver.switchTo().window(a.get(0));
               Thread.sleep(5000);
               driver.findElement(By.name("username")).sendKeys("9912847475");
               Thread.sleep(5000);
               driver.findElement(By.name("password")).sendKeys("9912847475");
          	   Thread.sleep(5000);
           	   driver.findElement(By.id("loginBTN")).click();	   
               Thread.sleep(5000);              
               driver.quit();
               
                
                
            
                
               
                 
                 
                 
                	 
                	 
     
                 
               
                 
                 
	                   
	   	   	
	}

}