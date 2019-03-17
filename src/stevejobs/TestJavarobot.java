
package stevejobs;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;	
public class TestJavarobot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException, HeadlessException, UnsupportedFlavorException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 WebDriverWait e=new WebDriverWait(driver,30);
		 e.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headingText']")));
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.name("identifier")).sendKeys("dineshrajanbodapati@gmail.com");
		 driver.findElement(By.xpath("//*[text()='Next']")).click();
		 driver.findElement(By.name("password")).sendKeys("9703097999");
		 driver.findElement(By.xpath("//*[text()='Next']")).click();
		 driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		 driver.findElement(By.xpath("//*[@name='to']")).sendKeys("dinesh.rajan47475@gmail.com");
		 driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("wishes from batch239");
		 driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi sir,\nHow are you in heaven?\nBye sir.");
		 driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
		 StringSelection x=new StringSelection("C:\\Users\\HP\\Desktop\\IMG_20180527_172813_894.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
	     Robot robot = new Robot();
	     Thread.sleep(5000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     String y=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
	     System.out.println(y);
	     Thread.sleep(5000);
	     e.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='dQ']")));
	     driver.findElement(By.xpath("//*[text()='Send']")).click();
	     e.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@aria-live='assertive'])[3]/descendant::*[3][1]")));
	   	     String z=driver.findElement(By.xpath("(//*[@aria-live='assertive'])[3]/descendant::*[3][1]")).getText();
	     	System.out.println(z);
	     driver.findElement(By.xpath("//*[contains(@title,'Google Account')]")).click();
	     driver.findElement(By.xpath("//*[text()='Sign out']")).click();

		 
		 
		 
		 
		 

	}

}
