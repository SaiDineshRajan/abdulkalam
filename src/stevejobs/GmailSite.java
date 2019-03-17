package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailSite {

	public static void main(String[] args) throws Exception  
	{
		    System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://www.gmail.com");
		    driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("dineshrajanmcc",Keys.ENTER);
		    //driver.findElement(By.id("identifierNext")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.name("password")).sendKeys("9703097999",Keys.ENTER);
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//*[@class='gb_db gbii']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("gb_71")).click();
		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   {
			  
		   }
		   
		   
	}
    }