package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test7 {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.instagram.com");
     driver.findElement(By.linkText("Log in")).click();
     driver.findElement(By.name("username")).sendKeys("dineshbodapati");
     driver.findElement(By.name("password")).sendKeys("Alto6345!");
     driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
     driver.findElement(By.xpath("//*[contains(@class,'_avvq0 _o716c')]")) .sendKeys("sachin tendulkar");
     driver.findElement(By.xpath("//*[contains(text(),'Options')[1]]")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
     
	}
}
