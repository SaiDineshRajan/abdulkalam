import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {

	public static void main(String[] args) 
	{
	      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	      ChromeDriver a=new ChromeDriver();
	      a.navigate().back();
	      a.navigate().forward();
	      a.navigate().refresh();
	      a.get("https://www.google.co.in/");
	      a.navigate().to("http://www.saibaba.org/");
	      a.manage().getCookies();
	     int w = a.manage().window().getSize().getWidth();
	     int h=a.manage().window().getSize().getHeight();
	     System.out.println(w+" "+h);
	      a.navigate().back();
	      a.navigate().forward();
	      a.navigate().refresh();
	      a.close();

	  
	}

}
