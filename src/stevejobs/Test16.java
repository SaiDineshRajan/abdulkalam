package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test16 {

	public static void main(String[] args) throws InterruptedException
	{
		
       System.setProperty("webdriver.gecko.driver","E:\\batch239\\geckodriver.exe");
       
       FirefoxDriver x=new FirefoxDriver();
       
       x.get("http://www.mercurytravels.co.in");
       
       
       x.findElement(By.xpath("//*[@id='flights']")).click();
       
       Thread.sleep(5000);
       
       try
       {
    	   WebElement e=x.findElement(By.xpath("(//*[@name='tripType'])[2]"));
    	   
    	   if(e.isDisplayed()){
    		   
    		   
    		   if(e.isEnabled())
    			   
    		   {	   
    			   e.click();
    			   
    			   if(e.isSelected())
    			
    					   {
    				        
    				   
    				          System.out.println("selected");
    				            
    					   }
    			   else
    			   {
    				   System.out.println("NOT SELECTED");
    				   
    				   
    			   }
    		   }	    			   
    		   else
    		   {
    			   System.out.println("Disabled");
    			   
    			   
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
       
       x.close();
       
       
    		   
    		   
             
    			   
    			   
    			   
    		   
    	   
       
       
       
       
       
       
       
       
       
	}

}
