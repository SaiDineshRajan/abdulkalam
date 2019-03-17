package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CallArd {

	public static void main(String[] args) throws Exception
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter contact name");
        String x=sc.nextLine();
        System.out.println("Enter contact position");
        int y=sc.nextInt();
       System.out.println("Enter numbers position ");
        int z=sc.nextInt();
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
			//Automation
			try
				{
					WebDriverWait w=new WebDriverWait(driver,20);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Recents']")));
					//driver.findElement(By.xpath("//*[@text='Contacts']")).click();
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id='android:id/input']")));
					driver.findElement(By.xpath("//*[@resource-id='android:id/input']")).click();
					driver.findElement(By.xpath("//*[@resource-id='android:id/input']")).sendKeys(x);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id='android:id/list']")));
					try
					{
		
						if(driver.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/empty_text']")).isDisplayed())
								{
							       System.out.println("no contacts found");
								}
						
					}
					catch(Exception exe)
					{
						driver.findElement(By.xpath("//*[@class='android.view.View'][@index='"+y+"']")).click();
						w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Share']")));
						w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id='com.android.contacts:id/fab']")));
						driver.findElement(By.xpath("//*[@class='android.widget.ListView'][@index='"+z+"']")).click();
						Thread.sleep(10000);
						
						
							if(driver.findElementByXPath("//*[@text='DIALLING']").isDisplayed())
									{
								      driver.findElementByXPath("//*[@content-desc='End']").click();
									}
						}
						
						
				
			}
			catch(Exception exe)
			{
				System.out.println(exe.getMessage());
			}
	}

}
