package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptionsselecttag {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(2000);
		/*WebElement e=driver.findElement(By.name("country"));
		Thread.sleep(2000);
		Select s=new Select(e);
		 List<WebElement> l=s.getOptions();
		 System.out.println(l);
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i).getText());
		 }*/
		 WebElement e=driver.findElement(By.name("nights"));
		 Thread.sleep(2000);
		 Select s= new Select(e);
		 Thread.sleep(2000);
		 List<WebElement> l=s.getOptions();
		 Thread.sleep(2000);
		 //System.out.println(l);
		 Thread.sleep(2000);
		 
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i).getText());
		 }
		 driver.close();
		 

	}

}
