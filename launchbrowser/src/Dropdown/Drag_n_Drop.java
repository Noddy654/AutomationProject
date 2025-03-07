package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop {

public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		Actions a= new Actions (driver);
		
		WebElement drag= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement drop= driver.findElement(By.xpath("//div[text()='Laptop Accessories']"))	;	
		
		a.dragAndDrop(drag,drop).perform();
				
				
      }



}
