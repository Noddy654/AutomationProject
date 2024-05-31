package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_by_axes {

	private static final char[] Product = null;

	public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		//Thread.sleep(2000);	
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		WebElement dynamicProduct =driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']"));
		
        String price=dynamicProduct.getText();
        
        System.out.println(Product);
		
	}

}
