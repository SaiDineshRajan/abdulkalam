package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demopage1 
{
	
	public WebDriver driver;
    @FindBy(linkText="REGISTER")
    public WebElement reg;
    
    
    
    public Demopage1 (WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    public void click()
    {
    	reg.click();
    }
}
