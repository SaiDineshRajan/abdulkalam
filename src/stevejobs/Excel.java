package stevejobs;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception 
	{
	   File f=new File("book1.xls");
	   Workbook rwb=Workbook.getWorkbook(f);
	   Sheet rsh=rwb.getSheet(0);
	   int nour=rsh.getRows();
	   int nouc=rsh.getColumns();
	   //open same excel file for writing
	   WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	   WritableSheet wsh=wwb.getSheet(0);
	   //automation
	   try
	   {
		   Date d=new Date();
		   Label l1=new Label(nouc,0,"result on"+d.toString());
		   wsh.addCell(l1);
		   //0th row has column headings
		   for(int i=1;i<nour;i++)
		   {
			   String x=rsh.getCell(0,i).getContents();
			   System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
				ChromeDriver driver =new ChromeDriver();
				driver.get("https://www.google.co.in");
				WebDriverWait w=new WebDriverWait(driver,20);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
				driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
				//check title
				String y=driver.getTitle();
				if(y.contains(x))
				{
					Label l2=new Label(nouc,i,"Test passed");
							wsh.addCell(l2);
				}
				else
				{
					File src=driver.getScreenshotAs(OutputType.FILE);
					File dest=new File("failscr on"+d.toString()+".png");
					FileUtils.copyFile(src, dest);
					Label L3=new Label(nouc,i,"Test failed: "+dest.getAbsolutePath());
					wsh.addCell(L3);
				}
				//close site
				driver.close();
		   }
	   }
		   
		   catch(Exception e)
		   {
			   
				System.out.println(e.getMessage());
		   }
	   wwb.write();
	   wwb.close();
	   rwb.close();
		   
	   
	   
	}

}
