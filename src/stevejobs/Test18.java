package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test18 {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.gecko.driver","E:\\batch239\\geckodriver.exe");
		  
		  FirefoxDriver f=new FirefoxDriver();
		  
		  f.get("https://www.google.co.in/");
		  
		  Thread.sleep(3000);
		  
		 //TO MAXIMIZE WINDOW
		  
		  f.manage().window().maximize();
		  
		  Thread.sleep(3000);
		  
		  //GET SIZE
		  
		  int w=f.manage().window().getSize().getWidth();
		  
		  int h=f.manage().window().getSize().getHeight();
		  
		  System.out.println(w+" "+h);
		  
		  //SET SIZE
		  
		  Dimension d=new Dimension(100,200);
		  
		  Thread.sleep(3000);
		  
		  //GET POSITION
		  
		  int x=f.manage().window().getPosition().getX();
		  
		  int y=f.manage().window().getPosition().getY();
		  
		  
		  //SET POSITION
		  
		  Point p=new Point(100,400);
		  
		  f.manage().window().setPosition(p);
		  
	Thread.sleep(3000);
	
	f.close();
		  
		  
	}

}
