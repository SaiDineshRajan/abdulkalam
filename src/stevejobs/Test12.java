package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("http://www.way2sms.com");
	      
	      int c=driver.findElements(By.xpath("(//img)|[@type='image']")).size();
	      
	      System.out.println(c);
	       
	      
	      //WAY1=GET COUNT OF IMAGES WHICH ARE DEVELOPED USING "IMG"TAG AND "INPUT" TAG
	      
	      //List<WebElement> l1 = driver.findElements(By.tagName(("img")));
	      
	      //List<WebElement> l2 = driver.findElements(By.xpath("//input[@type='image']"));
	      
	      //int c= l1.size()+l2.size();
	      
	      //System.out.println(c);
	      
	      //driver.close();
	      
	      
	      
	}

}