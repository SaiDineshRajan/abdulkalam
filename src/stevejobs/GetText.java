package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) 
	{       // TO GET AND DISPLAY SRC VALUE OF 8TH IMAGE IN PAGE
		
		//WAY1-FINDING ELEMENTS USING LIST
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			  ChromeDriver driver=new ChromeDriver();
			    driver.get("http://newtours.demoaut.com/");
			    
			   //String x= driver.findElement(By.xpath("(//img)[8]")).getAttribute("src");
			    
			   //System.out.println(x);
			    

			   // TO GET AND DISPLAY SRC VALUE OF 8TH IMAGE IN PAGE
			    //WAY2- USING XPATH
			    List<WebElement> l=driver.findElements(By.tagName("img"));
			    
			    String x=l.get(7).getAttribute("src");
			    
			    System.out.println(x);
			    
			    
			    
			    
			    
			    

	}

}
