package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	public ChromeDriver driver;
	@BeforeMethod
	public void launch()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(3000);
	}
	@Test(dataProvider="searchword",dataProviderClass=Mydata.class)
	@Parameters({"searchword"})
	public void search(String x)throws Exception
	{
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void close()throws Exception
	{
		driver.close();
	}
}
