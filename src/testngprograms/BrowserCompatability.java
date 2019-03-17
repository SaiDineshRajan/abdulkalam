package testngprograms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserCompatability 
{
	public WebDriver driver;
  @Test(priority=0)
  @Parameters({"browser"})
  public void launch(String b) throws Exception
  {
	  if(b.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.google.co.in");
			Thread.sleep(5000);
		}
			
	    else if(b.equals("firefox"))
	    	
	{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://www.google.co.in");
			Thread.sleep(5000);
			
	}
	    else if(b.equals("opera"))
	    {
            OperaOptions oo=new OperaOptions();
            oo.setBinary("C:\\Users\\Lenovo\\AppData\\Local\\Programs\\Opera\\55.0.2994.44\\opera.exe");
			System.setProperty("webdriver.chrome.driver","operadriver.exe");
			driver=new OperaDriver(oo);
			driver.get("http://www.google.co.in");
			
			
	    }
		else
		{
			Reporter.log("unknown browser");
		}
	  
  }
  @Test(priority=1,dependsOnMethods= {"launch"})
  @Parameters({"searchword"})
  public void search(String x) throws Exception
  {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
  	String t=driver.getTitle();
  	  if(t.contains(x))
  	  {
  		  Assert.assertTrue(true, "google title test passed");
  	  }
  	  else	
  	  {
  		  Date d=new Date();
  		  SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
  		  String ssname=dt.format(d);
  		  File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  		  File dest=new File(ssname+".png");
  		  FileUtils.copyFile(src,dest);
  		  String path="<img src=\"file:///E:\\batch239\\abdulkalam\\"+ssname+".png \"alt=\"\"/>";
  		  Reporter.log(path);
  		  Assert.assertTrue(false,"google title test failed");
  		  
  	  }
  	  }
  	  @Test(priority=2,dependsOnMethods= {"search"})
  	  public void close()
  	  {
  		  driver.close();
  	  }
  }