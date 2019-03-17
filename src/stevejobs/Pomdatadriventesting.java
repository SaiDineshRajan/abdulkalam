package stevejobs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Pomdatadriventesting {

	public static void main(String[] args) throws Exception, IOException 
	{
	   //open excel in read mode using Jxl
		File f=new File("pom.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		//open html for results using extent reports
		ExtentReports er=new ExtentReports("pomgmailres.html",false);//to append results
		ExtentTest et=er.startTest("Gmail login test");
		//Automation with DDT in POM
		try
		{
			//DDT FOR 2ND ROW (INDEX IS 1)
			for(int i=1;i<nour;i++)
			{
				//get data from excel sheet
				String bname=rsh.getCell(0,i).getContents();
				String u=rsh.getCell(1,i).getContents();
				String uc=rsh.getCell(2,i).getContents();
				String p=rsh.getCell(3,i).getContents();
				String pc=rsh.getCell(4,i).getContents();
				WebDriver driver=null;
				if(bname.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","chromedriver.exe");
					driver=new ChromeDriver();
					
				}
				else if(bname.equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver","geckodriver.exe");
					driver=new FirefoxDriver();
					
				}
				else if(bname.equals("opera"))
				{
					OperaOptions oo=new OperaOptions();
					oo.setBinary("C:\\Users\\Lenovo\\AppData\\Local\\Programs\\Opera\\55.0.2994.44\\opera.exe");
					System.setProperty("webdriver.opera.driver","operadriver.exe");
					driver=new OperaDriver(oo);
				}
				else if(bname.equals("ie"))
				{
					System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
					driver=new InternetExplorerDriver();
					
				}
				else
				{
					et.log(LogStatus.SKIP, "Unknown Browser");
					//save and close excel
					rwb.close();
					//save Extent Reports and close 
					er.endTest(et);
					er.flush();
					System.exit(0);
			}
				//create object to pageclasses
				Homepage hp=new Homepage(driver);
				Loginpage lp=new Loginpage(driver);
				Composepage cp=new Composepage(driver);
				//launch site
				driver.get("http://www.gmail.com");
				WebDriverWait w=new WebDriverWait(driver,20);
				w.until(ExpectedConditions.visibilityOf(hp.uid));
				driver.manage().window().maximize();
				//do login
				hp.filluid(u);
				hp.clickuinext();
				Thread.sleep(10000);
				//uid Testing
				try
				{
					if(u.length()==0 && driver.findElement(By.xpath("//*[contains(text(),'Enter an email or')]")).isDisplayed())
					{
						et.log(LogStatus.PASS, "Blank Test uid passed");
					}
					else if(uc.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
					{
						et.log(LogStatus.PASS, "invalid uid test passed");
					}
					else if(uc.equals("valid") && lp.pwd.isDisplayed())
                        {
	                            et.log(LogStatus.PASS, "valid uid test passed");
	                            //password testing
	                            lp.fillpwd(p);
	                            lp.clickpwdnext();
	                            Thread.sleep(5000);
	                            try
	                            {
	                            	if(p.length()==0 && driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
	                            	{
	                            		et.log(LogStatus.PASS, "blank password test passed");
	                            	}
	                            	else if(pc.equals("invalid") &&driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
                                    {
                                    	et.log(LogStatus.PASS, "invalid test password passed");
                                    }
	                            	else if(pc.equals("valid") && cp.comp.isDisplayed())
	                            	{
	                            		et.log(LogStatus.PASS, "valid pwd test passed");
	                            	
	                            	//do logout
	                            	cp.clickprofile();
	                            	w.until(ExpectedConditions.visibilityOf(cp.signout));
	                            	cp.clicksignout();
	                            	}
	                            	else
	                            	{
	                            		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                            		File dest =new File("gmailss3.png");
	                            		FileUtils.copyFile(src, dest);
	                            		et.log(LogStatus.FAIL, "pwdtest failed " +et.addScreenCapture("gmailss3.png"));
	                            	}
	
                                      }
	                            catch(Exception ex)
	                            {

                            		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                            		File dest =new File("gmailss4.png");
                            		FileUtils.copyFile(src, dest);
                            		et.log(LogStatus.FAIL, "pwdtest failed " +et.addScreenCapture("gmailss4.png"));
	                            }
	                            
	                            }
                        else
                        {
                        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                		File dest =new File("gmailss1.png");
                		FileUtils.copyFile(src, dest);
                		et.log(LogStatus.FAIL, "pwdtest failed " +et.addScreenCapture("gmailss1.png"));
                        }
			}
				catch(Exception ey)
				{
					 File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		     		File dest =new File("gmailss2.png");
		     		FileUtils.copyFile(src, dest);
		     		et.log(LogStatus.FAIL, "pwdtest failed " +et.addScreenCapture("gmailss2.png"));

				}
				driver.close();
			
				}
		}//loop closing
			catch(Exception ez)
			{
				et.log(LogStatus.ERROR, ez.getMessage());
			}
		//save and close excel
		rwb.close();
		//save and close extent reports
		er.endTest(et);
		er.flush();
		}

}
