package stevejobs;


import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class R {


	public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.w3schools.com/css/css_dropdowns.asp");
//	WebElement e=driver.findElement(By.name("country"));
//	Select s=new Select(e);
//s.selectByVisibleText("INDIA");
	
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
    driver.switchTo().frame("iframeResult");
    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    WebElement e=driver.findElement(By.name("cars"));
    Select s=new Select(e);
    List<WebElement> l=s.getOptions();
    
    System.out.println(l.size());
    for(int i=0;i<l.size();i++)
    {
    System.out.println(l.get(i).getText());
    
    }

		Method m[]=s.getClass().getMethods();
		System.out.println(m.length);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getName());
		}
				
		driver.close();		
				
}

}
