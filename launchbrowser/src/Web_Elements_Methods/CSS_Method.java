package Web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Method {

public static void main (String []args ) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.get("https://www.facebook.com");
		
//	    WebElement getCssProperty = driver.findElement(By.xpath("//button[text()='Log in']"));		
//		System.out.println(getCssProperty);
		
		
		//Verify the logo of flipkart
		
		Thread.sleep(3000);
		WebElement logo= driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']"));
				
	    if(logo.isDisplayed())
	    {
	    	System.out.println("Logo is displayed");
	    }
	    else
	    {
	    	System.out.println("Logo is not displayed");
	    }
		
		
		
	}

}
