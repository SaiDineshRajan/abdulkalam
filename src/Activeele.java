import org.openqa.selenium.chrome.ChromeDriver;

public class Activeele {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String x=driver.switchTo().activeElement().getTagName();
		System.out.println(x);
	}

}
