package stevejobs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  File src=driver.getScreenshotAs(OutputType.FILE);
		  File dest=new File("E:\\batch239\\Screenshot.png");
		  FileUtils.copyFile(src, dest);

	}

}
