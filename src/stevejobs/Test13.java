package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test13 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		
		ChromeDriver x = new ChromeDriver();
		
		x.get("https://www.snapdeal.com/");
		
		List l1=x.findElements(By.tagName("img"));
		
		List l2=x.findElements(By.xpath("//input[@type='image']"));
		
		int c=l1.size()+l2.size();
		
		System.out.println(c);
		
		
		
		
		

	}

}
