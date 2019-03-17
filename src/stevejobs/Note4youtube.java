package stevejobs;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Location;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Note4youtube {

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
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
		try
		{
			driver.get("http://www.youtube.com");
			driver.context("NATIVE_APP");
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search YouTube']")));
			driver.findElement(By.xpath("//*[@text='Search YouTube']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='More options']")));
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("abdul kalam sir speech");
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search YouTube']")));
			driver.findElement(By.xpath("//*[@text='Search YouTube']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.view.View'][@index='5']")));
			driver.findElement(By.xpath("//*[@class='android.view.View'][@index='5']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='video']")));
			TouchAction ta=new TouchAction(driver);
			WebElement e=driver.findElement(By.xpath("//*[@text='video']"));
			ta.tap(e);
			TouchAction ta1=new TouchAction(driver);
			ta1.waitAction(Duration.ofMillis(10)).tap(e);
			MultiTouchAction ma=new MultiTouchAction(driver);
			ma.add(ta).add(ta1).perform();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='enter full screen']")));
			driver.findElement(By.xpath("//*[@text='enter full screen']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='exit full screen']")));
			driver.findElement(By.xpath("//*[@text='exit full screen']")).click();
			driver.closeApp();
		}
			catch(Exception ef)
			{
				System.out.println(ef.getMessage());
			}
			
			Runtime.getRuntime().exec("taskkill /F IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
			
			
		
			
			
			
			
			
		}
		
	}


