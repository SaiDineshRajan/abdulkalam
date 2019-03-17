import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position1 {

	public static void main(String[] args) {

	      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	      ChromeDriver a=new ChromeDriver();
	      a.get("https://www.facebook.com/");
	      a.manage().window().maximize();
	     /* int w=a.manage().window().getSize().getWidth();
	      int h=a.manage().window().getSize().getHeight();
	      System.out.println(w+" "+h);*/
	      //set size
	      Dimension d=new Dimension(500,700);
	      a.manage().window().setSize(d);
	      int x=a.manage().window().getPosition().getX();
	      int y=a.manage().window().getPosition().getY();
	      System.out.println(x+" "+y);
	      //set position
	      Point p=new Point(-100,-400);
	      System.out.println(p);
	      a.manage().window().setPosition(p);
	      
	      
	      
	}

}
