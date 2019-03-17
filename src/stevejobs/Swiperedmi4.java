package stevejobs;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Swiperedmi4 {

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
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
                           		driver.pressKeyCode(AndroidKeyCode.HOME);
		WebDriverWait wa=new WebDriverWait(driver,50);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Gallery']")));
		driver.findElement(By.xpath("//*[@text='Gallery']")).click();
		try
		{
			
			wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.RelativeLayout'][@index='24']")));
			driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout'][@index='24']")).click();

					
		}
		catch(Exception ed)
		{

			System.out.println(ed.getMessage());
		}
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//[@resource-id='com.miui.gallery:id/slip_layout'][@index='1']")));
		WebElement e=driver.findElement(By.xpath("//[@resource-id='com.miui.gallery:id/slip_layout'][@index='1']"));
		TouchAction ta=new TouchAction(driver);
		ta.waitAction(Duration.ofMillis(10)).tap(e).release().perform();
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
