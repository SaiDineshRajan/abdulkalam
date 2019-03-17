package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Doubletap {

	public static void main(String[] args) throws IOException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.vodqareactnative");
		dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driver;
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
			try
			{
				WebDriverWait w=new WebDriverWait(driver,30);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
				driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Double Tap']")));
				driver.findElement(By.xpath("//*[@text='Double Tap']")).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Double Tap Me']")));
				WebElement z=driver.findElement(By.xpath("//*[@text='Double Tap Me']"));
				//doubletap on element 
			    TouchAction ta =new TouchAction(driver);
			    ta.tap(z);
			    TouchAction ta1=new TouchAction(driver);
			    ta1.waitAction(Duration.ofMillis(10)).tap(z);
			    MultiTouchAction ma = new MultiTouchAction(driver);
			    ma.add(ta).add(ta1).perform();
			    try
			    {
			    	if(driver.findElement(By.xpath("//*[@text='Double tap successful!']")).isDisplayed())
			    	{
			    		System.out.println("operation is finished");
			    	}
			    	else
			    	{
			    		System.out.println("operation is  not finished");
			    	}
			    }
			    
			    catch(Exception ex)
			    {
			    	System.out.println("operation is  not finished");			    }
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
			
	
	}
	
}
