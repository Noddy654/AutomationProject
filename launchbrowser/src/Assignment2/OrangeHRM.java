package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	
public static void main (String []args ) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//Using Username
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("1234");
	
	//Using password
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("aaaa");
	
	
    }
}