package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test17 {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver","E:\\batch239\\geckodriver.exe");
	  
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	  
	  
	  
	  
	 driver.navigate().to("https://www.google.com/");
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().back();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().refresh();
	 
	 Thread.sleep(3000);
	 
	 driver.close();
	 
	 
	}

}
