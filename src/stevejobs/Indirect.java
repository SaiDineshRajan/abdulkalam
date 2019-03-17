package stevejobs;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Indirect {

	public static void main(String[] args) throws Exception
	{
	    DesiredCapabilities d = new DesiredCapabilities();
	    d.setCapability(CapabilityType.BROWSER_NAME,"");
	    d.setCapability("deviceName","a7145711");
	    d.setCapability("platformName","android");
	    d.setCapability("platformVersion","9");
	   d.setCapability("AutomationName","uiautomator2");
	    d.setCapability("appPackage","com.miui.player");
	    d.setCapability("appActivity","com.miui.player.component.MusicBrowserActivity");
	    Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	    URL u=new URL("http:\\0.0.0.0:4723/wd/hub");
	    AndroidDriver driver;
	    while(2>1)
	    {
	    	try
	    	{
	    		driver=new AndroidDriver(u,d);
	    		break;
	    	}
	    	catch(Exception ex)
	    	{
	    		
	    	}
	    	
	    }
	    KeyEvent k=new KeyEvent(AndroidKey.HOME);
	    driver.pressKey(k);
	    //Activity a=new Activity("com.mixerradio.mobileapps","com.mightyloud.mobileapps.SplashScreen");
	    //driver.startActivity(a);
	    String x=  driver.currentActivity();
		  System.out.println(x);
		  //Thread.sleep(3000);
	    //WebDriverWait w=new WebDriverWait(driver,10);
	    Activity b=new Activity("com.mixerradio.mobileapps","com.mightyloud.mobileapps.MainActivity");
	    driver.startActivity(b);
	   // w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id='com.mixerradio.mobileapps:id/login']")));
	    //driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.mixerradio.mobileapps:id/login\")").click();
	    driver.findElement(By.xpath("//*[@resource-id='com.mixerradio.mobileapps:id/login']")).click();
	    

	}

}
