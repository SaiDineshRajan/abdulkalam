import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="http://demo.guru99.com/test/upload/";
		driver.get(url);
		WebElement e=driver.findElement(By.id("uploadfile_0"));
		e.sendKeys("C:\\Users\\Lenovo\\Documents\\4.txt");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		WebElement a=driver.findElement(By.xpath("//center[contains(text(),'1 file ')]"));
		System.out.println(a.getText());
		Thread.sleep(4000);
	}

}
