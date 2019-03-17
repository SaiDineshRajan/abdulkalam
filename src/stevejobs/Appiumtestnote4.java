package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Appiumtestnote4 {

	public static void main(String[] args) throws IOException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.vodqareactnative");
		dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u =new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driver;
		while(2>1)
		{
			try
			{
				driver =new AndroidDriver(u,dc);
			    break;
			}
			catch(Exception ex)
			{
			}
			
		}
		//automate
		try
		{
			WebDriverWait w=new WebDriverWait(driver,30);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
			driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drag & Drop']")));
			driver.findElement(By.xpath("//*[@text='Drag & Drop']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drag me!']")));
			WebElement e1=driver.findElement(By.xpath("//*[@text='Drag me!']"));
			WebElement e2 =driver.findElement(By.xpath("//*[@text='Drop here.']"));
			TouchAction ta = new TouchAction(driver);
			Duration d = Duration.of(10,ChronoUnit.SECONDS);
		    ta.press(e1).waitAction(d).moveTo(e2).release().perform();
		    try
		    {
		    	if(driver.findElement(By.xpath("//*[@text='Circle dropped']")).isDisplayed())
		    		
		    	{
		           System.out.println("operation is finished");
		    	}
		    	else
		    	{
		    		System.out.println("operation failed");
		    	}
		    
			}
		    catch(Exception exc)
		    {
		    	System.out.println(exc.getMessage());
		    	
		    }
		    driver.closeApp();
		    }
		catch(Exception ey)
		{
			System.out.println(ey.getMessage());
		}
		 
		
	}

}
