package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nav {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromeDriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.3pillarglobal.com/insights/appium-a-cross-browser-mobile-automation-tool");
		driver.navigate().to("http://www.google.co.in");
		driver.navigate().forward();
		driver.navigate().back();
	}

	
}
