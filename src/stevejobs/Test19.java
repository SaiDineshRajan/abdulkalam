package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {
     
	//DELETE ALL COOKIES 
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		
		  ChromeDriver driver=new ChromeDriver();
		  
		  

		  //DELETE ALL COOKIES
		  
		  driver.manage().deleteAllCookies();
		  
		  //LAUNCH SITE
		  
		  driver.get("https://www.youtube.com/");
		  
		  if(driver.manage().getCookies().size()!=0)
		  {
			  System.out.println("cookies were loaded");
			  
		  }
		  else
		  {
			  System.out.println("cookies were not loaded");
			  
		  }
			  
		  driver.close();
	}

}
