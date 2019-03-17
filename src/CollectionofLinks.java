import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionofLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.twitter.com");
		List<WebElement> l=driver.findElements(By.xpath("//a[@href]"));
		System.out.println(l.size());
		driver.close();
		

	}

}
