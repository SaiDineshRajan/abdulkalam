package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@autocomplete='on']")).sendKeys("dineshrajan4747");
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@class='js-password-field']")).sendKeys("Alto6345!1");
	   Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search-query")).sendKeys("Sachin Tendulkar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='Icon Icon--medium Icon--search nav-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='Icon Icon--dm Icon--large']")).click();
		Thread.sleep(5000);
	}

}
