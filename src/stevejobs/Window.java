package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
	}

}
