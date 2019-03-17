package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		
		ChromeDriver z=new ChromeDriver();
		
		z.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//z.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		z.findElement(By.name("identifier")).sendKeys("dineshrajanbodapati");
		
		z.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		z.findElement(By.name("password")).sendKeys("9703097999");
		Thread.sleep(5000);
		
		z.findElement(By.xpath("//span[text()='Next']")).click();		
		Thread.sleep(5000);
		int c = z.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr")).size();		
		System.out.println(c);				
		z.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[1]/td[2]/div")).click();
		z.findElement(By.xpath("//*[contains(@style,'margin-right')]/descendant::div[11]/div[3]")).click();
		Thread.sleep(5000);
		z.findElement(By.xpath("//*[@aria-label='Account Information']/preceding::span[1]")).click();		
		Thread.sleep(5000);		
		z.findElement(By.linkText("Sign out")).click();
		z.close();
		
		
		
		
		
	
		
		
		

		

	}

}
