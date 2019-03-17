package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Note4 {

	public static void main(String[] args) throws Exception 
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "34b40e339904");
		dc.setCapability("devicePlatform","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity", "com.android.contacts.activities.TwelveKeyDialer");
		//Start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u =new URL("http://0.0.0.0:4723/wd/hub");
		//create driver object
		AndroidDriver driver;
		while(3>1)
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
		driver.pressKeyCode(AndroidKeyCode.HOME);
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		Duration d=Duration.of(5,ChronoUnit.SECONDS);
		int x1=(int)(w*0.8);
		int y1=(int)(h/2);
		int x2=(int)(w*0.4);
		int y2=(int)(h/2);
		while(3>1)
		{
			try
			{
				driver.findElement(By.xpath("//*[@text='Prime Video']")).click();
				break;
			}
			catch(Exception e)
			{
				ta.press(x1, y1).moveTo(x2, y2).waitAction(d).release().perform();
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		driver.launchApp();
		driver.pressKeyCode(AndroidKeyCode.HOME);
		driver.closeApp();
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		

	}

}
