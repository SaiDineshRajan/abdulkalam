package stevejobs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestng 
{
	public ChromeDriver driver;
	@DataProvider(name="searchword")
	public Object[][] testdata()
	{
	return new Object[][]
	{
		{"kalam"},
		{"selenium"},
		{"appium"}
				
	};
	}
	@BeforeMethod
	public void launch()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(3000);
	}
	@Test(dataProvider="searchword")
	public void search(String x)throws Exception
	{
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(2000);
		String t=driver.getTitle();
		if(!t.contains(x))
		{
		 Assert.assertTrue(true, "google title test passed");	
		}
			
		else
		{
			Date d=new Date();
			SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			String ssname=dt.format(d);
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(ssname+".png");
			FileUtils.copyFile(src,dest);
			String path="<img src=\" file:///E:\\batch239\\abdulkalam\\"+ssname+".png\" alt=\"\"/>";
			Reporter.log(path);
			Assert.assertTrue( false,"google title test failed");
			
		}
	}
	@AfterMethod
	public void close()throws Exception
	{
		driver.close();
	}
}
