package stevejobs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter browser name");
		String x=sc.nextLine();
		WebDriver driver1 = null;
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
			   if(x.equals("dinesh.rajan47@gmail.com"))
			   {
		
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("dinesh.rajan47@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("lordshiridisairam",Keys.ENTER);
		driver.close();
			   }
			   else
			   if(x.equals("dineshrajanbodapati@gmail.com"))
			   {
				   driver.findElement(By.name("identifier")).sendKeys("dineshrajanbodapati@gmail.com",Keys.ENTER);
				   Thread.sleep(4000);
				   driver.findElement(By.name("password")).sendKeys("9703097999",Keys.ENTER);
				   driver.findElement(By.xpath("//*[contains(@title,'Google Account')]")).click();
				   driver.findElement(By.linkText("Sign out")).click();
				  
			   }
			   else
				   if(x.equals("dineshrajanmcc@gmail.com"))
				   {
					   driver.findElement(By.name("identifier")).sendKeys("dineshrajanmcc@gmail.com",Keys.ENTER);
					   Thread.sleep(4000);
					   driver.findElement(By.name("password")).sendKeys("9703097999",Keys.ENTER);
					   Thread.sleep(4000);
					   
			   }
				   else
					   if(x.equals("dinesh.rajan47475@gmail.com"))
					   {
						   driver.findElement(By.name("identifier")).sendKeys("dinesh.rajan47475@gmail.com");
			   Thread.sleep(4000);
			   driver.findElement(By.name("password")).sendKeys("Alto6345!1",Keys.ENTER);
			   Thread.sleep(4000);
	}
	
	   else
	  {
	
		System.out.println("unknown");
 	  }
			   
}

}
