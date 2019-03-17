package stevejobs;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.types.resources.selectors.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mymethods 
{
   public WebDriver driver;
   public WebDriverWait wait;
   public String screenshot() throws Exception
   {
	   Date dt=new Date();
	   String ssname=dt.toString();
	   File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File(ssname+".png");
	   FileUtils.copyFile(src, dest);
	   return(ssname);
   }
   public String launch(String e,String d,String c) throws Exception
   {
	if(e.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(e.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver=new FirefoxDriver();
				
	}
	else if(e.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else if(e.equals("opera"))
	{
		OperaOptions oo=new OperaOptions();
		oo.setBinary("C:\\Users\\Lenovo\\AppData\\Local\\Programs\\Opera\\55.0.2994.44\\opera.exe");
		System.setProperty("webdriver.opera.driver","operadriver.exe");
		driver=new OperaDriver(oo);
		
	}
	else
	{
		return("unknown Browser");
	}
	driver.get(d);//open Url
	wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
	driver.manage().window().maximize();
	return("done");
	
   }
   public String fill(String e,String d,String c)throws Exception
   {
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
	   driver.findElement(By.xpath(e)).sendKeys(d);
	   return("done");
	   
   }
 
   public String click(String e,String d,String c)throws Exception
   {
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
	   driver.findElement(By.xpath(e)).click();
	   return("done");
	   
   }
   public String validatelogin(String e,String d,String c)throws Exception
	{
		try
		{
			if(c.equals("all_valid")&& driver.findElement(By.xpath("//*[text()='SendSMS']")).isDisplayed())
			{
				return("passed");

				
				
			}
			else if(c.equals("mbno_blank")&& driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("mbno_invalid")&& driver.findElement(By.xpath("(//*[text()='Invalid Mobile Number'])[1]")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_blank")&& driver.findElement(By.xpath("(//*[text()='Enter password'])[2]")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_invalid")&& driver.findElement(By.xpath("(//b[text()='Incorrect number or password! Try Again.'])[1]")).isDisplayed())
			{
				return("passed");
			}
		
			else
			{
				String temp=this.screenshot();
				return("Test Failed & goto"+temp+".png");
			}
		}
   
	   catch(Exception ex)
	   {
		   String temp=this.screenshot();
		   return("Test interrupted & goto "+temp+".png");
	   }
   }
   
	   public String closeSite(String e,String d,String c) throws Exception
	   {
		   driver.close();
		   return("done");
	   }
	   
	   
   }

