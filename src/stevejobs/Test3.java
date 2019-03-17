package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException 
		{
		 System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com");
		 driver.findElement(By.linkText("REGISTER")).click();
		 driver.findElement(By.name("firstName")).sendKeys("abdul");
		 driver.findElement(By.name("lastName")).sendKeys("kalam");		 
		 driver.findElement(By.name("phone")).sendKeys("9703097999");
		 driver.findElement(By.name("userName")).sendKeys("apj@abdulkalam.com");
		 driver.findElement(By.name("address1")).sendKeys("MosqueStreet");
		 driver.findElement(By.name("address2")).sendKeys("dhanushkotiRoad");
		 driver.findElement(By.name("city")).sendKeys("Rameshwaram");
		 driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	     driver.findElement(By.name("postalCode")).sendKeys("53004");
		 Select s=new Select(driver.findElement(By.name("country")));
		 s.selectByValue("92");
		 driver.findElement(By.name("email")).sendKeys("apj@abdulkalam.com");
		 driver.findElement(By.name("password")).sendKeys("batch239sleepers");
		 driver.findElement(By.name("confirmPassword")).sendKeys("batch239sleepers");
		 driver.findElement(By.name("register")).click();
		 Thread.sleep(5000);
		}
	 
	    }


