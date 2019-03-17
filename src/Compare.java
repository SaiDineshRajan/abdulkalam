import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.way2sms.com/");
		WebElement x=d.findElement(By.xpath("//div[text()='INDIA’S #1 SMS PLATFORM']"));
		
				
	}

}
