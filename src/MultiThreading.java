import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiThreading  extends Thread
 {
    public void run()
    {
    	try
    	{
    		Thread.sleep(2000);
    		StringSelection x=new StringSelection("mindq");
    		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
    		Robot r=new Robot();
    		r.keyPress(KeyEvent.VK_CONTROL);
    		r.keyPress(KeyEvent.VK_V);
    		r.keyRelease(KeyEvent.VK_V);
    		r.keyRelease(KeyEvent.VK_CONTROL);
    		Thread.sleep(5000);
    		r.keyPress(KeyEvent.VK_TAB);
    		r.keyRelease(KeyEvent.VK_TAB);
    		Thread.sleep(5000);
    		StringSelection y=new StringSelection("mindq123");
    		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
    		r.keyPress(KeyEvent.VK_CONTROL);
    		r.keyPress(KeyEvent.VK_V);
    		r.keyRelease(KeyEvent.VK_V);
    		r.keyRelease(KeyEvent.VK_CONTROL);
    		Thread.sleep(5000);
    		r.keyPress(KeyEvent.VK_ENTER);
    		r.keyRelease(KeyEvent.VK_ENTER);
    	}
    	catch(Exception ex)
    	{
    	}
    	
    }
    public static void main(String[] args) throws Exception
    {
    	MultiThreading obj=new MultiThreading();
    	obj.start();
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	ChromeDriver driver =new ChromeDriver();
    	driver.get("https://eforms.agility.com/");
        Thread.sleep(4000);
    	driver.manage().window().maximize();
    	Thread.sleep(30000);
    	driver.close();
    }
}
