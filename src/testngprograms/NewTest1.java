package testngprograms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest1 
{
	public WebDriver driver;
	@DataProvider(name="browser1")
	public Object[][] browser()
			{
		return new Object[][]
				{
		{"chrome"}, 
		{"firefox"},
		{"ie"}
				};	
		
}
	public Object[][] words()
	{
return new Object[][]
		{
{"stars"}, 
{"moon"},
{"waterfalls"}
		};
	
}
		
@Test(dataProvider="browser1")
public void launch(String t) throws Exception
{
	if(t.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
				
		Thread.sleep(5000);
	}
    else if(t.equals("firefox"))
    	
{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		

		Thread.sleep(5000);
}
    else if(t.equals("ie"))
    {

		System.setProperty("webdriver.gecko.driver","InternetExplorerServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
    }
	else
	{
		Reporter.log("unknown browser");
	}

}
  @Test(dataProvider="browser1")
  public void search(String t) throws Exception
  {
	  driver.findElement(By.name("q")).sendKeys(t,Keys.ENTER);
	  Thread.sleep(5000);
	  String y=driver.getTitle();
	  if(y.contains(t))
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
 
 @Test
  public void close() 
   {
	  driver.close();
  }

}
