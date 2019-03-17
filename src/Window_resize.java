 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_resize {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println(h+""+w);
		//set size]
		Dimension d=new Dimension(200,3000);
		driver.manage().window().setSize(d);
		//get position
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+""+y);
		//set position
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);

	}

}
