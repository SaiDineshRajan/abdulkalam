package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Ardnote4call {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phone number");
		String x=sc.nextLine();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.TwelveKeyDialer");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u =new URL("http://0.0.0.0:4723/wd/hub");
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
			//locate and operate elements
			try
			{
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				//dial phone number
				for(int i=0;i<x.length();i++)
				{	
				  char c=x.charAt(i);
				   String y="";
				   switch(c)
				  {
					case '0':
					y="zero";
					break;
					case '1':
					y="one";
					break;
					case '2':
					y="two";
					break;
					case '3':
					y="three";
					break;
					case '4':
					y="four";
					break;
					case '5':
					y="five";
					break;
					case '6':
					y="six";
					break;
					case '7':
					y="seven";
					break;
					case '8':
					y="eight";
					break;
					case '9':
					y="nine";
	     			break;	
		     	}
				   Thread.sleep(10000);
				   driver.findElement(By.xpath("//*[@content-desc='"+y+"']")).click();
				}		
		
				
			driver.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/single_call_button']")).click();
              
			
			     try
			    {
				     if(driver.findElement(By.xpath("//*[@text='DIALLING']")).isDisplayed())
				     {
				    	 driver.findElement(By.xpath("//*[@content-desc='End']")).click();
				     }
			     }
			     catch(Exception ey)
			     {
			    	 driver.findElement(By.xpath("//*[@content-desc='End']")).click();
			     }
			
			     driver.closeApp();
			}
	
			     catch(Exception eh)
			     {
				    System.out.println(eh.getMessage());
			     }
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
			
	}





		
