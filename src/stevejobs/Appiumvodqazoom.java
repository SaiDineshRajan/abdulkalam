/package stevejobs;

import java.io.IOException;
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

public class Appiumvodqazoom {

	public static void main(String[] args) throws IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage","com.vodqareactnative");
		dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
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
			WebDriverWait w=new WebDriverWait(driver,30);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
			driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='photoView']")));
			driver.findElement(By.xpath("//*[@content-desc='photoView']")).click();
			TouchAction ta=new TouchAction(driver);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.ImageView']")));
			WebElement z=driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
			driver.context("NATIVE_APP");
		  /* int x=z.getLocation().getX();
		    int y=z.getLocation().getY();
		    int w2=z.getSize().getWidth();
		    int h=z.getSize().getHeight();*/
		    ta.press(491,1062).waitAction(Duration.ofMillis(200)).moveTo(317,1062).release();
		    Thread.sleep(2000);
			TouchAction ta2=new TouchAction(driver);
			 ta2.press(491,1062).waitAction(Duration.ofMillis(200)).moveTo(700,1062).release();
			MultiTouchAction ma=new MultiTouchAction(driver);
			ma.add(ta).add(ta2);
			ma.perform();
			Thread.sleep(3000);
			/*TouchAction ta3=new TouchAction(driver);
			ta3.press(z,x+w2/2, y+h/2-120).moveTo(z,x+w2/2,y+h/2-20);
			TouchAction ta4=new TouchAction(driver);
		    ta4.press(z,x+w2/2, y+h/2+120).moveTo(z,x+w2/2,y+h/2+20);*/
			
		}
			catch(Exception ey)
			{
				System.out.println(ey.getMessage());
			}
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
