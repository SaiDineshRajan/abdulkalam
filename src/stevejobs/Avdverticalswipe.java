package stevejobs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Avdverticalswipe
{
   public static void main(String[] args) throws Exception 
   {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		
		AppiumDriver driver;
		while(2>1)
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		  WebDriverWait w1=new WebDriverWait(driver,20);
		  w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Cities']")));
		  driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
		  //perform swipe to the required elemet
		  driver.context("NATIVE_APP");
		  int w=driver.manage().window().getSize().getWidth();
		  int h=driver.manage().window().getSize().getHeight();
		  TouchAction ta=new TouchAction(driver);
		  int x1=(int)(w/2);
		  int y1=(int)(h*0.7);
		  int x2=(int)(w/2);
		  int y2=(int)(h*0.4);
		  while(2>1)
		  {
			  try
			  {
				  driver.findElement(By.xpath("//*[@text='Bangalore']")).click();
				  break;
				  
			  }
			  catch(Exception ex)
			  {
				  ta.press(x1,y1).moveTo(x2, y2).release().perform();
			  }
		  
		  }
		  //swipe from top to bottom
		  y1=(int)(h*0.3);
		  y2=(int)(h*0.8);
		  while(2>1)
		  {
			  try
			  {
				  driver.findElement(By.xpath("//*[@text='Amman']")).click();
				  break;
			  }
			  catch(Exception ex)
			  {
				  ta.press(x1, y1).moveTo(x2, y2).release().perform();
			  }
		  }
		  driver.closeApp();
			  
			  Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			  Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		  
		
		}
	}


