package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class HorizontalswipeAvd 
{

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.calendar");
		dc.setCapability("appActivity","com.android.calendar.AllInOneActivity");
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
		//swipe to app screen
		try
		{
			driver.context("NATIVE_APP");
			int wd=driver.manage().window().getSize().getWidth();
			int h=driver.manage().window().getSize().getHeight();
			TouchAction ta=new TouchAction(driver);
			//swipe from right to left
			int x1=(int)(wd*0.9);
			int y1=(int)(h/2);
			int x2=(int)(wd*0.4);
			int y2=(int)(h/2);
			for(int i=1;i<=5;i++)
			{
				Duration d=Duration.of(5,ChronoUnit.SECONDS);
				ta.press(x1, y1).waitAction(d).moveTo(x2, y2).release().perform();
				
			}
			//swipe from left to right
			x1=(int)(wd*0.3);
			y1=(int)(h/2);
			x2=(int)(wd*0.9);
			y2=(int)(h/2);
			for(int i=1;i<=5;i++)
			{
				Duration d=Duration.of(5,ChronoUnit.SECONDS);
				ta.press(x1, y1).waitAction(d).moveTo(x2, y2).release().perform();
				
			}
			driver.closeApp();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
		


	}

}
