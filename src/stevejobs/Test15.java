package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Test15 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\batch239\\geckodriver.exe");
		
		FirefoxDriver x=new FirefoxDriver();
		
		x.get("https://www.facebook.com/");
		
		x.switchTo().activeElement().sendKeys("dinesh");
		
		Thread.sleep(5000);
		
		x.close();

	}

}
