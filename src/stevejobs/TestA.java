package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {

	public static void main(String[] args) throws InterruptedException 
	{
		
      System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.bmw.in");
      Thread.sleep(5000);
      String x=driver.getCurrentUrl();
      if(x.contains("https"))
      {
    	  System.out.println("securedsite");
    	
      }
      else {
    	  System.out.println("unsecured");
      }
      driver.close();
	}

}
