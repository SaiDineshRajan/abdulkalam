package stevejobs;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.ApplicationState;

public class Calculator {

	public static void main(String[] args)  throws Exception{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","7bcbed36");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","4.4.4");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver;
		while(3>1)
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception ec)
			{
				
			}
			
		}
		//driver.closeApp();
		//Activity a=new Activity("com.miui.calculator","com.miui.calculator.cal.CalculatorActivity");
		//driver.startActivity(a);
		ApplicationState as=driver.queryAppState("com.miui.calculator");
		System.out.println(as.toString());
		
		
		
	}

}
