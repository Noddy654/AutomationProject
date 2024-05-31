package Web_Elements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.shoppersstack.com");
		
		driver.findElement(By.xpath("//span[text()='Santoor']")).click();
		driver.findElement(By.name("Check Delivery")).sendKeys("12344");
		
		driver.findElement(By.xpath("button[id='Check']")).click();
		
		
		
	}

}
