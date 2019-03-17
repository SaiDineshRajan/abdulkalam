package stevejobs;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class TestSai 
{

	public static void main(String[] args) throws Exception 
	{

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","34b40e339904");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.flipkart.android");
		dc.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
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
					
				try
				{
					WebDriverWait wa=new WebDriverWait(driver,30);
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Existing User? SIGN IN']")));
					driver.findElement(By.xpath("//*[@text='Existing User? SIGN IN']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Email/Mobile no.']")));
				    WebElement e=driver.findElement(By.xpath("//*[@text='Email/Mobile no.']"));
				    e.click();
				    wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='NONE OF THE ABOVE']")));
				    driver.findElement(By.xpath("//*[@text='NONE OF THE ABOVE']")).click();
				    wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Email/Mobile no.']")));
				    e.sendKeys("9703097999");
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Password']")));
					WebElement d=driver.findElement(By.xpath("//*[@text='Password']"));
					d.clear();
					d.sendKeys("9703097999");
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='SIGN IN']")));
					driver.findElement(By.xpath("//*[@text='SIGN IN']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=' Search for Products, Brands and More']")));
					WebElement t=driver.findElement(By.xpath("//*[@text=' Search for Products, Brands and More']"));
					t.click();
					t.sendKeys("redmi");
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='CONTINUE']")));
					driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ALLOW']")));
					driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='open search']")));
					driver.findElement(By.xpath("//*[@content-desc='open search']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Search grocery products in Supermart']")));
					driver.findElement(By.xpath("//*[@content-desc='Search grocery products in Supermart']")).clear();
					driver.findElement(By.xpath("//*[@content-desc='Search grocery products in Supermart']")).sendKeys("redmi note5");
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='redmi note 5']")));
					driver.findElement(By.xpath("//*[@text='redmi note 5']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.view.View']")));
					driver.findElement(By.xpath("//*[@class='android.view.View']")).click();
					wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='open wishlist']")));
					driver.findElement(By.xpath("//*[@content-desc='open wishlist']")).click();
				}
				catch(Exception ez)
				{
					System.out.println(ez.getMessage());
				}
		
				Runtime.getRuntime().exec("taskkill /F /IM node.exe");
				Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
				
  
	}

}
