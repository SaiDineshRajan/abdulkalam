package stevejobs;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Freetts {

	public static void main(String[] args) throws InterruptedException, EngineException, AudioException, EngineStateError
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String x=sc.nextLine();
		//launch google site
		System.setProperty("webdriver.chrome.driver","E:\\batch239\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--use-fake-ui-for-media-stream=1");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.co.in/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gsri_ok0']")));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='gsri_ok0']")).click();
		Thread.sleep(1500);
		//convert text into voice
		System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		Synthesizer s=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
		s.allocate();
		s.resume();
		s.speakPlainText(x,null);
		s.waitEngineState(Synthesizer.QUEUE_EMPTY);
		s.deallocate();
		//validate results
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='resultStats']")));
		String y=driver.getTitle();
		x=x.toLowerCase();
		y=y.toLowerCase();
		if(y.contains(x))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		
		

	}

}
