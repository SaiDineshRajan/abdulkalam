

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","chromedriver.exe");
         ChromeDriver a=new ChromeDriver();
         a.get("http://www.way2sms.com/");
         a.switchTo().activeElement().sendKeys("9703097999");
         try
         {
        if( a.findElement(By.name("password")).isDisplayed())
        {
           if(a.findElement(By.name("password")).isEnabled())
           {
        	   a.findElement(By.name("password")).sendKeys("9703097999");
        	   a.close();
           }
        }
         }
         catch(Exception ex)
         {
        	 System.out.println(ex.getMessage());
         }
         
	}

}
