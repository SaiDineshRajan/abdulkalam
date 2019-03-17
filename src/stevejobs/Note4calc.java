package stevejobs;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Note4calc {

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
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
//		try
//		{
//			driver.findElement(By.xpath("//*[@text='8']")).click();
//			driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
//			driver.findElement(By.xpath("//*[@text='4']")).click();
//			driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
//			String x =driver.findElement(By.xpath("//*[@class='android.widget.HorizontalScrollView']")).getAttribute("text");
//			System.out.println("x");
//		}
//		catch(Exception ex)
//		{
//			System.out.println(ex.getMessage());
//		}
	
	   Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	   Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

}

}