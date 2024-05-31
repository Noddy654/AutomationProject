package Locators_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_iPhone {

	public static void main (String []args ) throws InterruptedException   {
			
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
			
	driver.get("https://www.flipkart.com");
			
	//search iphone in Textfield

	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	
	//identify all iPhone name list

	List<WebElement> iphoneName = driver.findElements(By.xpath("//div[class='KzDlHZ']"));
	
	//identify all iPhone price list
	Thread.sleep(3000);
	List<WebElement> iphonePrice = driver.findElements(By.xpath("//div[@class='KzDlHZ']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
	
	
			for(int i=0;i<iphoneName.size();i++)
			{
				String name =iphoneName.get(i).getText();
				for(int j=1;j<=i;j++)
				{
					String price =iphonePrice.get(j).getText();
					System.out.println(name+" : "+price);
				}
			}

//			for(int i=0;i<iphonePrice.size();i++)
//			{
//				System.out.println(iphonePrice.get(i).getText());
//			}
	
       }

}
