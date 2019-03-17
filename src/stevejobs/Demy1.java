package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Demy1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.udemy.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Screen s=new Screen();
		s.click("demy.png");
	}

}
