import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Isselected {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver a=new ChromeDriver();
		a.get("https://www.mercurytravels.co.in/");
		WebDriverWait w=new WebDriverWait(a,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("flights")));
		a.findElement(By.id("flights")).click();
			WebElement e=a.findElement(By.linkText(" Flights"));
			e.click();
			try
			{
				WebElement e2=a.findElement(By.xpath("(//input[@type='radio'])[2]"));
				if(e2.isDisplayed())
				{
					if(e2.isEnabled())
					{
						e2.click();
						if(e2.isSelected())
						{
							System.out.println("is Selected");
						}
						else
						{
							System.out.println("Not Selected");
						}
				      }
					else
					{
						System.out.println(" is not enabled");
				
					}
				}
		
				else
				{
					System.out.println("not displayed");
				
				
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
	        }
			a.close();	
	}

}
