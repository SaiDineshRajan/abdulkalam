package stevejobs;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyRegmethods 
{
    public WebDriver driver;
    public WebDriverWait wait;
    public String screenshot() throws Exception
    {
    	Date dt=new Date();
    	String image=dt.toString();
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dest=new File(image+".png");
    	FileUtils.copyFile(src, dest);
  	return(image);		
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
    		System.setProperty("webdriver.gecko.driver","E://geckodriver.exe");
    		driver=new FirefoxDriver();
    		
    	}
    	else if(e.equals("opera"))
    	{
    		OperaOptions oo=new OperaOptions();
    		oo.setBinary("C:\\Users\\Lenovo\\AppData\\Local\\Programs\\Opera\\56.0.3051.36\\opera.exe");
    		System.setProperty("webdriver.opera.driver","E://opera.exe");
    		driver=new OperaDriver(oo);
    		
    	}
    	else
    	{
    		return("unknown Browser");
    	}
    	driver.get(d);
    	wait=new WebDriverWait(driver,20);
    	driver.manage().window().maximize();
    	return("done");
    }
    public String click(String e,String d, String c)
    {
    	driver.findElement(By.xpath(e)).click();
    	return("done");
    }
    public String fill(String e,String d,String c) throws Exception
    {
    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(e)));
    	driver.findElement(By.xpath(e)).sendKeys(d);
    	return("done");
    }
    public String filldate(String e,String d,String c) throws Exception
    {
    	WebElement e1=driver.findElement(By.xpath("//*[@class='xdsoft_datetimepicker xdsoft_noselect xdsoft_']"));
    	Actions a=new Actions(driver);
    	a.click(e1).build().perform();
    	List<WebElement> l=driver.findElements(By.xpath("//*[@class='xdsoft_label xdsoft_month']"));
    	for(int i=0;i<=l.size();i++)
    	{
    		a.sendKeys(Keys.ENTER).build().perform();
    		break;
    	}
    	
    	driver.findElement(By.xpath(e)).sendKeys(d);
    	
        	return("done");
    	
    }
    public String dropdown(String e,String d,String c)
    {
    	
    	driver.findElement(By.xpath(e)).click();
    	WebElement e1=driver.findElement(By.name(e));
    	Select s=new Select(e1);
	    List<WebElement> l=s.getAllSelectedOptions();
	    for(int i=0;i<l.size();i++)
	    {
	    //System.out.println(l.get(i).getText());
	    	 s.selectByIndex(12);
	    }
	   
    	return("done");
    	
    }
    public String closesite(String e,String d,String c)
    {
    	driver.close();
    	return("done");
    }
    
    
}

