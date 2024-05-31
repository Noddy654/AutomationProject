package Assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://www.yatra.com");
		
		//Search Bus
		driver.findElement(By.id("booking_engine_buses")).click();
		
		
		//Travel destination in one field
		WebElement from =driver.findElement(By.id("BE_bus_from_station"));
		from.click();
		from.sendKeys("Delhi");
		driver.findElement(By.xpath("//li[@class='active ac_over']")).click();
		
		//Travel destination in other field
		 WebElement to =driver.findElement(By.id("BE_bus_to_station"));
		 Thread.sleep(2000);
		 to.click();
		 Thread.sleep(2000);
		 to.sendKeys("Jaipur");
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//li[@class='active ac_over']")).click();
		
		
		//Travel date
		driver.findElement(By.name("bus_depart_date")).sendKeys("01st- June");
		
	
		//Search buses
		
		 driver.findElement(By.id("BE_bus_search_btn")).click();
		 
		 
	//For print all the details 
	List<WebElement> allBuses = driver.findElements(By.xpath("//div[@class='v-card__text srp-touple']"));
 
	for(int i=0;i<allBuses.size();i++)
	{
		String bus = allBuses.get(i).getText();
		System.out.println(bus);
		System.out.println("----------------------");
	}

      }
}