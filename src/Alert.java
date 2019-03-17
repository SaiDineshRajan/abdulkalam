import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Try it Yourself »")).click();
	Thread.sleep(5000);
  // WebElement e=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
    driver.switchTo().frame(5);
    driver.quit();
   // driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
//    Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[text()='Try it']")).click();
//	String x=driver.switchTo().alert().getText();
//	System.out.println(x);
//	driver.switchTo().alert().accept();
//	driver.switchTo().defaultContent();
//	driver.quit();
	
	
}


}
