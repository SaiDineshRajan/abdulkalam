import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception
	{
 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
 ChromeDriver a=new ChromeDriver();
 a.get("http://demo.guru99.com/test/delete_customer.php");
 a.manage().window().maximize();
 a.findElement(By.name("cusid")).sendKeys("123456");
 a.findElement(By.name("submit")).click();
 String x=a.switchTo().alert().getText();
 System.out.println(x);
 a.switchTo().alert().accept();
 Thread.sleep(3000);
 String y=a.switchTo().alert().getText();
 System.out.println(y);
 a.switchTo().alert().accept();
 a.close();

	}

}
