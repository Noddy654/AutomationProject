package Javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor {

public static void main (String []args ) throws InterruptedException   {
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						
				driver.get("https://paytm.com");
				
				JavascriptExecutor js= (JavascriptExecutor)driver;
				
				for(int i=0;i<2;i++)
				{
					js.executeScript("window.scrollBy(0,2000)");
					Thread.sleep(2000);
				}
				
				for(int i=0;i<2;i++)
				{
					js.executeScript("window.scrollBy(0,-2000)");
					Thread.sleep(2000);
				}
				
				
				
	}

}
