package Assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {

public static void main (String []args ) throws InterruptedException, AWTException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://paytm.com");
		
		Actions a= new Actions (driver);
		
		WebElement rightClickButton= driver.findElement(By.xpath("//div[text()='Download Paytm App']"));
		
		a.contextClick(rightClickButton).perform();
		
		Robot r=new Robot();
		
		//Press the Key
				r.keyPress(KeyEvent.VK_0);
				r.keyPress(KeyEvent.VK_1);
				r.keyPress(KeyEvent.VK_2);
				
				
				//Release the Key
				
				r.keyRelease(KeyEvent.VK_0);
				r.keyRelease(KeyEvent.VK_1);
				r.keyRelease(KeyEvent.VK_2);
				
				driver.findElement(By.xpath("")),Keys.ARROW_DOWN,Keys.ENTER;
		
	}

}
