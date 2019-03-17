package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException 	
	{
     System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.instagram.com");
     driver.findElement(By.linkText("Log in")).click();
     driver.findElement(By.name("username")).sendKeys("dineshbodapati");
     driver.findElement(By.name("password")).sendKeys("Alto6345!");
     driver.findElement(By.xpath("//*[text()='Log in']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[@class='_8scx2 _gvoze coreSpriteDesktopNavProfile']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[@class='_q8y0e coreSpriteMobileNavSettings _8scx2']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	}
}
