package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testrehanna {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\batch239\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('q').value='selenium';");

	}

}
