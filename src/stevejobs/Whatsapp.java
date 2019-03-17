package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); 
        driver.get("https://www.google.co.in/");
        Thread.sleep(5000);
        String x=driver.findElementByCssSelector("div.jsb>center>input:nth-of-type(1)").getAttribute("value");
        System.out.println(x);
      String y=driver.findElementByCssSelector("div.jsb>center>input:last-child").getAttribute("value");
      System.out.println(y);
        driver.findElementByCssSelector("div#gs_lc0>input:nth-of-type(1)").sendKeys("career");
        driver.findElement(By.linkText("Features")).click();
        String x1 = driver.findElement(By.xpath("//*[contains(text(),'Simple, Reliable Messaging')]")).getText();
        System.out.println(x1);
        driver.close();

	}

}
