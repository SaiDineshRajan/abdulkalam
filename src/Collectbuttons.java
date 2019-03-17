import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectbuttons {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.1/getting-started/download/");
		/*List<WebElement> l=driver.findElements(By.xpath("//button"));
		System.out.println(l.size());
		List<WebElement> e=driver.findElements(By.xpath("//button[text()='Primary']"));
		System.out.println(e.size());*/
		WebElement downloadbutton=driver.findElement(By.xpath("(//a[text()='Download'])[2]"));
		downloadbutton.click();
		Thread.sleep(1000);
		String src =downloadbutton.getAttribute("href");
		System.out.println(src);
		String wget_command="cmd /c D:\\Wget\\wget.exe -P D:\\ --no-check-certificate" +src;
		System.out.println(wget_command);
		try
		{
			Process exec=Runtime.getRuntime().exec(wget_command);
			int exitval=exec.waitFor();
			System.out.println("exitval is:"+exitval);
		}
		catch(InterruptedException | IOException ex)
		{
			System.out.println(ex.toString());
		}
		driver.close();
	}
}
