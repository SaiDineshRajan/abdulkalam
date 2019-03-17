package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testnew {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E://batch239//chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		x.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		x.manage().window().maximize();
		WebElement e=x.findElement(By.name("identifier"));
		Actions a=new Actions(x);
		a.sendKeys(e,"dineshrajanbodapati").build().perform();
		WebElement e1=x.findElement(By.xpath("//*[text()='Next']"));
		a.click(e1).build().perform();
		WebDriverWait w=new WebDriverWait(x,50);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		WebElement e2=x.findElement(By.name("password"));
		a.sendKeys(e2,"9703097999").build().perform();
		WebElement e3=x.findElement(By.xpath("//*[@id='passwordNext']/descendant::span"));
		a.click(e3).build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));
		WebElement e4=x.findElement(By.xpath("//*[text()='COMPOSE']"));
		a.click(e4).build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		WebElement e5=x.findElement(By.name("to"));
		a.sendKeys(e5,"sams.reehana4@gmail.com").build().perform();
		WebElement e6=x.findElement(By.name("subjectbox"));
		a.sendKeys(e6,"testing").build().perform();
		WebElement e7=x.findElement(By.xpath("(//*[@aria-label='Message Body'])[4]"));
		a.sendKeys(e7,"testing related notes").build().perform();
		WebElement e8=x.findElement(By.xpath("(//*[@aria-label='Attach files'])[2]"));
		a.click(e8).build().perform();
		
	
	

	}

}
