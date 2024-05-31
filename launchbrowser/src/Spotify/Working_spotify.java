package Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_spotify {

	
public static void main (String []args ) throws InterruptedException  {
		
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();


driver.get("https://open.spotify.com");

Thread.sleep(3000);
//Using click on Search
driver.findElement(By.cssSelector("//a[@aria-label='Search']")).click();


//Using search Text field	
driver.findElement(By.cssSelector("input[data-testid='search-input']")).sendKeys("Ae dil hai Mushkil");





	}

}
