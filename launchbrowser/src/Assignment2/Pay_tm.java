package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pay_tm {

public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://paytm.com");
	
		Actions a =new Actions(driver);
		
		
		WebElement mouseHover1 =driver.findElement(By.linkText("Paytm for Consumer"));

		a.moveToElement(mouseHover1).perform();
		
		WebElement mousehover2 = driver.findElement(By.linkText("Payments"));
		
		Thread.sleep(2000);
		
		a.moveToElement(mousehover2).perform();
		a.click(driver.findElement(By.linkText("Online Payments"))).perform();
		
		
                           // doubleClick()
		
		
		Object doubleClickButton;
		WebElement doubleClickButton1 =driver.findElement(By.xpath("//div[@class='IA_rP']"));
		a.doubleClick(doubleClickButton1).perform();
		
	
	}

}
