package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleis {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	     driver.switchTo().frame("iframeResult");
	     WebElement e=driver.findElement(By.name("cars"));
	     Select s=new Select(e);
	     if(s.isMultiple())
	     {
	    	 System.out.println("MULTISELECT");
	     }
	     else
	     {
	    	 System.out.println("SINGLESELECT");
	     }
	     driver.switchTo().defaultContent();
	     driver.close();

	}
	 

}
