package Web_Elements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {
	
	public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement usernameTextfield =driver.findElement(By.name("email"));
		usernameTextfield.sendKeys("ADMIN");
		usernameTextfield.clear();
	
	
     }


}
