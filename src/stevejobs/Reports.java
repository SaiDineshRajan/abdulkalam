package stevejobs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		ExtentReports er=new ExtentReports("googleres.html",false);
		ExtentTest et=er.startTest("google title test");
		//launch site
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		//search word
		String y=driver.getTitle();
		if(y.contains(x))
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("passcr.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.PASS, "Title test passed");
			et.log(LogStatus.PASS,et.addScreenCapture("passcr.png"));
			
			
		}
		else
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("failscr.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.FAIL, "Title test failed");
			et.log(LogStatus.FAIL, et.addScreenCapture("failscr.png"));
		}
		//close site
		driver.close();
		er.endTest(et);
		er.flush();
		
		
		

	}

}
