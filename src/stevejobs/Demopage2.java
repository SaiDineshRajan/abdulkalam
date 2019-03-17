package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demopage2 
{
     public WebDriver driver;
     @FindBy(name="firstName")
     public WebElement fname;
     
     @FindBy(name="lastName")
     public WebElement lname;
     
     @FindBy(name="phone")
     public WebElement phone;
     
     @FindBy(name="userName")
     public WebElement mail;
     
     
     @FindBy(name="userName")
     public WebElement uname;
     
     @FindBy(name="address1")
     public WebElement add1;
     
   
     @FindBy(name="address2")
     public WebElement add2;
     
     @FindBy(name="city")
     public WebElement city;
     
     @FindBy(name="state")
     public WebElement st;
     
     
     @FindBy(name="postalCode")
     public WebElement pc;
     
     
    public Demopage2(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void fname(String x)
    {
    	fname.sendKeys(x);
    }
    
    public void lname(String x)
    {
    	lname.sendKeys(x);
    }
    public void  phone(String x)
    {
    	phone.sendKeys(x);
    }
    
    public void mail(String x)
    {
    	mail.sendKeys(x);
    }
    
    public void uname(String x)
    {
    	uname.sendKeys(x);
    }
    
    public void add1(String x)
    {
    	add1.sendKeys(x);
    }
    
    public void add2(String x)
    {
    	add2.sendKeys(x);
    }
    
    public void city(String x)
    {
    	city.sendKeys(x);
    }
    
    public void state(String x)
    {
    	st.sendKeys(x);
    }
    
    public void postal(String x)
    {
    	pc.sendKeys(x);
    }
    
    
     
     
}
