import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");
		driver.findElement(By.id("mobileNo")).sendKeys("9912847475");
		driver.findElement(By.id("password")).sendKeys("9912847475");
driver.findElement(By.xpath("//*[@onclick='return validLogin();']")).click();
driver.manage().window().maximize();
driver.findElement(By.id("mobile")).sendKeys("8977771413");
driver.findElement(By.id("message")).sendKeys("rich kid");
driver.findElement(By.xpath("(//*[starts-with(text(),'Send')])[3]")).click();
driver.findElement(By.xpath("//span[text()='Sent SMS']")).click();
if(driver.findElement(By.xpath("//a[contains(text(),'Sent SMS ')]")).isDisplayed())
{
	String x=driver.findElement(By.xpath("(//div[@class='msg-sent-info'])[1]/p[2]")).getText();
	System.out.println(x);
	
}

driver.findElement(By.xpath("//*[@class='logout']")).click();
	}

}
