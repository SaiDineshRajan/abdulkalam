package stevejobs;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumcalcAvd {

	public static void main(String[] args) throws IOException 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723 \"");
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
		    driver.findElement(By.xpath("//*[@text='9']")).click();
			driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
			driver.findElement(By.xpath("//*[@text='3']")).click();
			driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
			String x= driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
			System.out.println(x);
			driver.closeApp();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		      driver.closeApp();
		      Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		      Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
	
	}

}
