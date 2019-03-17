package stevejobs;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Maps {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("locationservicesEnabled",true);
		dc.setCapability("locationservicesAuthorized",true);
		dc.setCapability("appPackage","com.google.android.apps.maps");
		dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
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
		Thread.sleep(5000);
		//set location to marathahalli-bengaluru
		//using latitude longitude and altitude
		Location l1=new Location(12.959172,77.697419,2000);
		driver.setLocation(l1);
		Thread.sleep(20000);
		//set location to tajmahal 
		Location l2=new Location(27.175015,78.042155,2000);
		driver.setLocation(l2);
		Thread.sleep(20000);
		//driver.closeApp();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
			
		
	}

}
