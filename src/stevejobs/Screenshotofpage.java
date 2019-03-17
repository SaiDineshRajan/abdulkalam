package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotofpage {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("sudha murty");
		String t=e.getText();
		if(t.contains("sudha"))
		{		
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("screenshot.png");
			FileUtils.copyFile(src, dest);
		}
		else
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("screenshot.png");
			FileUtils.copyFile(src, dest);
		}
		WebElement e1=driver.findElement(By.id("hplogo"));
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
		int w=e1.getSize().getWidth();
		int h=e1.getSize().getHeight();
		//element screen shot
		File f=driver.getScreenshotAs(OutputType.FILE);
		BufferedImage bi=ImageIO.read(f);
		BufferedImage ci=bi.getSubimage(x, y, w, h);
		ImageIO.write(ci, "png", f);
		//save element screenshot
		File es=new File("googleguruji.png");
		FileUtils.copyFile(f, es);
		
		driver.close();
	}

}
