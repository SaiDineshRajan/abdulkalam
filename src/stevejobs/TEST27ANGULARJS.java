package stevejobs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TEST27ANGULARJS {
public static void main(String[] args) throws Exception
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter required word");
   String x=sc.nextLine();
   //LAUNCH SITE
   System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
   ChromeDriver driver =new ChromeDriver();
   driver.get("https://angularjs.org/");
   WebDriverWait w= new WebDriverWait(driver,10);
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='https://angular.io']")));
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   //FILL ANGULARJS ELEMENT
   driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys("SaiBaba");
   Thread.sleep(5000);
   String y=driver.findElement(By.xpath("//*[@ng-model='yourName']/following-sibling::*[2]")).getText();
   Thread.sleep(5000);
   if(y.contains(x))
   {
	   System.out.println("Test passed");
   }
   else
   {
	   System.out.println("Test Failed");
   }
   driver.close();
}  

       

}

   