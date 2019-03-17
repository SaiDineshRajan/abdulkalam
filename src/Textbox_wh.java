import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_wh{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");
		String x=driver.findElement(By.id("mobileNo")).getCssValue("color");
		System.out.println(x);
		String y=driver.findElement(By.id("mobileNo")).getCssValue("font");
		System.out.println(y);

	}

}
