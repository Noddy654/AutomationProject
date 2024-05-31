package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import java.util.Scanner;



public class Tag_Name {

	public static void main (String []args ) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com");
	WebElement searchTextField=driver.findElement(By.tagName("input"));
	
	searchTextField.sendKeys("books");
	
	
//	driver.get("https://www.amazon.in");
//	Thread.sleep(2000);
//	WebElement usernameTextField=driver.findElement(By.id("nav_cs_4"));
//	usernameTextField.sendKeys("Mobiles");
	
	
//	driver.get("https://www.facebook.com");
//	driver.findElement(By.name("email")).sendKeys("Krati@123");
	
//	driver.get("https://www.flipkart.com");
//	WebElement searchButton = driver.findElement(By.className("_52e0"));
//  searchButton.click();

	
	
//	driver.get("https://www.instagram.com");
//	
//	Thread.sleep(5000);
//	
//	WebElement usernameTextField=driver.findElement(By.name("username"));
//	usernameTextField.sendKeys("2345678909");
//	WebElement passwordTextField=driver.findElement(By.name("password"));
//	passwordTextField.sendKeys("000000");
//	
//	WebElement LoginTextField=driver.findElement(By.className("_acap"));
//	LoginTextField.click();
	}
	
}

