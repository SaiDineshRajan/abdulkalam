package stevejobs;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class All {

	public static void main(String[] args) throws Exception
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
		driver.pressKeyCode(AndroidKeyCode.HOME);
		driver.openNotifications();
		String s=driver.getDeviceTime();
		System.out.println(s);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		driver.context("NATIVE_APP");
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		int x1=(int)(w*0.9);
		int y1=(int)(h/2);
		int x2=(int)(w*0.4);
		int y2=(int)(h/2);
			try
			{
				WebDriverWait wa=new WebDriverWait(driver,20);
				wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='YouCam Perfect']")));
				WebElement e=driver.findElement(By.xpath("//*[@text='YouCam Perfect']"));
				e.click();
				
			}
			catch(Exception ex)
			{
				Duration d=Duration.of(5,ChronoUnit.SECONDS);
				ta.press(x1, y1).waitAction(d).moveTo(x2, y2).release().perform();
				
			}
	}

}
