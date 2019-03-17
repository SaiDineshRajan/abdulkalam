package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Test31youtube {

	public static void main(String[] args) throws SikuliException, InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
        d.get("https://www.youtube.com");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        d.findElement(By.name("search_query")).sendKeys("sachin Tendulkar ");
        d.findElement(By.xpath("//*[@id='search-icon-legacy']/child::*[1]")).click();
        d.findElement(By.xpath("//*[contains(@title,'WTD | S3E5 | Sachin Tendulkar & Virender Sehwag | What The Duck | Viu India')]")).click();
        Screen s=new Screen();
        Thread.sleep(9000);
        if(s.exists("add.PNG")!=null)
        {
        	s.click("add.PNG");
        }
        Location l=new Location(400,400);
        s.wheel(l,Button.LEFT,0);        
        Thread.sleep(2000);
        s.click("Pause.PNG");
        

	}

}
