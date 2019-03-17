package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class Testwifi
{

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.TwelveKeyDialer");
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
			catch(Exception ex)
			{
				
			}
		}	
		
			driver.pressKeyCode(AndroidKeyCode.HOME);
			Connection c=driver.getConnection();
			if(c.compareTo(Connection.AIRPLANE)==0)
			{
				System.out.println("AirPlane is on");
			}
			else
			{
				System.out.println("Airplane is off");
			}
			if(c.compareTo(Connection.DATA)==0)
					{
				      System.out.println("data is on");
					}
			else
			{
				System.out.println("data is off");
				driver.setConnection(Connection.DATA);
			}
			if(c.compareTo(Connection.WIFI)==0)
			{
				System.out.println("wifi is on");
			}
			else
			{
				
				
				System.out.println("wifi is off");
				driver.setConnection(Connection.WIFI);
			}
		
		
		

		
		
		
	}

}
