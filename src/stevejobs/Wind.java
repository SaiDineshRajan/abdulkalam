package stevejobs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wind {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://way2sms.com");
WebDriverWait w=new WebDriverWait(d,20);
d.manage().window().maximize();
d.findElement(By.xpath("//a[@href='https://twitter.com/way2sms']")).click();
ArrayList<String> al1=new ArrayList<String>(d.getWindowHandles());
for(int i=0;i<al1.size();i++)
{
System.out.println(i);
}

d.switchTo().window(al1.get(1));
w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
d.findElement(By.name("q")).sendKeys("8977771413");
Thread.sleep(5000);
d.switchTo().window(al1.get(0));
d.findElement(By.xpath("//a[@href='https://www.instagram.com/way2sms_official/?hl=en']")).click();
ArrayList<String> al2=new ArrayList<String>(d.getWindowHandles());
for(int i=0;i<al2.size();i++)
{
System.out.println(i);
}
d.switchTo().window(al2.get(2));
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Search']")));
d.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("reehana");



	}

}
