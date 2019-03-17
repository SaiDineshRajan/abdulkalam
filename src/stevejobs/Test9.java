package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("http://www.way2sms.com");
	      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      
	      //GET COUNT OF TEXTBOXES IN A PAGE
	      
	      //way1
	      
	      List<WebElement> l=driver.findElements(By.tagName("input"));
	      
	      int c=0;
	      
	        for(int i=0;i<l.size();i++)
	      {
	    	  String x=l.get(i).getAttribute("type");
	    	  
	    	  if(x.equals("text"))
	    	  {	  
	    	  
                 c=c+1;
                 
	    	  }
	    	  
	      }
	    		  
	    	System.out.println(c);	  
	      }
	    	  
	
         
	}



	
