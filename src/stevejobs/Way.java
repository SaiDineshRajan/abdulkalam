package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way {

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.way2sms.com");
	 Thread.sleep(3000);
	 driver.findElement(By.name("username")).sendKeys("9912847475");
	 driver.findElement(By.name("password")).sendKeys("9912847475");
	 driver.findElement(By.id("loginBTN")).click();
	 String x=driver.findElement(By.xpath("//*[@class='wrap menu']/p")).getText();
	 System.out.println(x);
	 //driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
	 //Thread.sleep(9000);
	 //driver.quit();
	 //driver.findElement(By.xpath("//*[text()='Send SMS']")).click();

	}

}
