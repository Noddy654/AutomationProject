package Javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor2 {

	public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://paytm.com");
		
//		WebElement privacy =driver.findElement(By.xpath("//span[text()='Every time']"));
//				
//		Rectangle rect =privacy.getRect();
//		int x=rect.getX();
//		int y=rect.getY();
//		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy("+x+","+y+")");
//		
	                               //OR

		WebElement privacy =driver.findElement(By.xpath("//span[text()='Every time']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",privacy);
		
		
		
		
	}

}

