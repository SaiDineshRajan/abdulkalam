package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Ardcalc {

	public static void main(String[] args) throws IOException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
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
		try
		{
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@text='9']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@text='3']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
			Thread.sleep(10000);
			String x= driver.findElement(By.xpath("//*[@content-desc='No formula']")).getAttribute("text");
			System.out.println(x);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
	

}
