package Web_Elements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_Method {

public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://www.facebook.com");
		
		// To identify the username Textfield
		
		WebElement usernameTextField= driver.findElement(By.name("email"));
	
		
		if(usernameTextField.isEnabled())
		{
			usernameTextField.sendKeys("Krant");
		}
				
				
		else
			System.out.println("UN text field is disabled");
	}

}
