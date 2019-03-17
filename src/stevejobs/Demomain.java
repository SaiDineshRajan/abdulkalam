package stevejobs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Demomain {

	public static void main(String[] args) throws Exception 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter browser name");
	   String x=sc.nextLine();
	   File f=new File("demo.xls");
	   Workbook rwb=Workbook.getWorkbook(f);
	   Sheet rsh=rwb.getSheet(0);
	   int nour=rsh.getRows();
	   ExtentReports er=new ExtentReports("Demotours.html",false);
	   ExtentTest et=er.startTest("demoreg test ");
	   WebDriver driver=null;
	   try
	   {
	   
	  
			   System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
			   driver=new ChromeDriver();
			  
				   String name=rsh.getCell(0,1).getContents();
				   String name1=rsh.getCell(0,2).getContents();
				   String name2=rsh.getCell(0,3).getContents();
				   String name3=rsh.getCell(0,4).getContents();
				   String name4=rsh.getCell(0,5).getContents();
				   String name5=rsh.getCell(0,6).getContents();
				   String name6=rsh.getCell(0,7).getContents();
				   String name7=rsh.getCell(0,8).getContents();
				   String name8=rsh.getCell(0,9).getContents();
			       
			   
			   //create objects to page classes
			   Demopage1 dm=new Demopage1(driver);
			   Demopage2 dm2=new Demopage2(driver);
			   //launch site
			   driver.get("http://www.demoaut.com");
			   WebDriverWait w=new WebDriverWait(driver,20);
			   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='SUPPORT']")));
			  dm.click();
			  w.until(ExpectedConditions.visibilityOf(dm2.fname));
			  dm2.fname(name);
			  dm2.lname(name1);
			  dm2.phone(name2);
			  dm2.mail(name3);
			  
		}
		catch(Exception ex)
		{
			
		}
		
			  
			  
			  rwb.close();
			  er.endTest(et);
			  er.flush();
			  
			  
			  
			  
			    
			   
			   
			   

	}

}
