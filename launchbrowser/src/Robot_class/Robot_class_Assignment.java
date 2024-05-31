package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class_Assignment {

public static void main (String []args ) throws InterruptedException, AWTException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://paytm.com");
		
		
		
		
		
		Robot r =new Robot();
		
	
	
	
	
	
     }

}
