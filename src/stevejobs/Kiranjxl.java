package stevejobs;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Kiranjxl 
{

	public static void main(String[] args) throws Exception 
	{
		File f=new File("E:\\batch239\\abdulkalam\\new.xls.xls");
        Workbook rwb=Workbook.getWorkbook(f);
        Sheet rsh=rwb.getSheet(0);
        int nour=rsh.getRows();
        int nouc=rsh.getColumns();
        WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
        WritableSheet wsh=wwb.getSheet(0);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("deviceName", "34b40e339904");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "7.0");
		//start appium server
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
		           Date d=new Date();
					Label l1=new Label(nouc,0,"Result on"+d.toString());
					wsh.addCell(l1);
		           for(int i=1;i<nour;i++)
		           {
		        	   String x=rsh.getCell(0,i).getContents();
                   driver.get("http://www.google.co.in");	
                   //driver.context("NATIVE_APP");
                   WebDriverWait w=new WebDriverWait(driver,20);
                   w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
                   //driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).click();
                   driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
                  // w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='q']")));
                   //driver.findElement(By.xpath("//*[@text='Google Search']")).click();
                   
                   String y=driver.getTitle();
                   if(y.contains(x))
                   {
                	   Label l2=new Label(nouc,i,"test passed");
                	   wsh.addCell(l2);
                	   
                			   
                   }
                   else
                   {
                	   Label l3=new Label(nouc,i,"test failed");
                	   wsh.addCell(l3);
                   }
                   
                   
		           }
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		driver.closeApp();
		wwb.write();
		
		
		}
	
	
		
	
}

