package Javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Web_Element {

public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	
		WebElement hiddenWebelement = driver.findElement(By.xpath("//label[text()='Custom']"));
		//hiddenWebelement.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Transgender'", hiddenWebelement);
		
	}

}
