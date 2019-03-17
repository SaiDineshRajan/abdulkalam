package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testrunnerclass {

	public static void main(String[] args)
	{
	   try
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter browser name");
		   String x=sc.nextLine();
		   WebDriver driver=null;
		   if(x.equals("chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
			   driver=new ChromeDriver();
			   
			   
		   }
		   else if(x.equals("firefox"))
		   { 
			   System.setProperty("webdriver.gecko .driver", "gecko.exe");
			   driver=new FirefoxDriver();
		   }
		   else if(x.equals("ie"))
		   {
			   System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
		   }
		   else if(x.equals("opera"))
		   {
			   OperaOptions oo=new OperaOptions();
			   oo.setBinary("C:\\Users\\Lenovo\\AppData\\Local\\Programs\\Opera\\55.0.2994.44\\opera.exe");
			   System.setProperty("webdriver.opera.driver","operadriver.exe");
			   driver=new OperaDriver(oo);
			   
		   }
		   else
		   {
			   System.out.println("unknown browser");
			   System.exit(0);
		   }
		   
		   //create objects to page classes to call objects 
		   Homepage hp=new Homepage(driver);
		   Loginpage lp=new Loginpage(driver);
		   Composepage cp=new Composepage(driver);
		   //launch site
		   driver.get("http://www.gmail.com");
		   WebDriverWait w=new WebDriverWait(driver,20);
		   w.until(ExpectedConditions.visibilityOf(hp.uid));
		   driver.manage().window().maximize();
		   //do login
		   hp.filluid("dineshrajanbodapati");
		   hp.clickuinext();
		   w.until(ExpectedConditions.visibilityOf(lp.pwd));   
		   lp.fillpwd("9703097999");
		   lp.clickpwdnext();
		   w.until(ExpectedConditions.visibilityOf(cp.comp));
		   //do logout
		   cp.clickprofile();
		   w.until(ExpectedConditions.visibilityOf(cp.signout));
		   cp.clicksignout();
		   driver.close();   
	   }
	   catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
	   }

	}

}
