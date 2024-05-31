package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Get_method {

public static void main (String[] args, Object keys) throws InterruptedException {

	// to launch the chrome browser
	WebDriver driver =new ChromeDriver();
	
	//to maximize the window
	driver.manage().window().maximize();
	
	//to launch the web application
	driver.get("https://www.amazon.in");
	
	//to use getTitle
	String actual_title=driver.getTitle();
	
	String expected_title="Amazon.in";
	
	if(actual_title.equals(expected_title))
	{
		System.out.println("Title is correct");
	}
	else
	{
		System.out.println("Title is wrong");
	}
	//to use getCurrenturl()
	String url =driver.getCurrentUrl();
	System.out.println("www.flipkart.com");
	
	// to getpagesource()
	String source =driver.getPageSource();
	System.out.println(source);
	
	//to click on link
	driver.findElement(By.linkText("Open a popup window")).click();
	
	driver.quit();
	//driver.close();

	//Use navigate method
	
	driver.navigate().to("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	//to set the size
	
	driver.manage().window().setSize(new Dimension(150,200));
	
	//to set the position
	
	driver.manage().window().setPosition(new Point(200,300));
	
	//to switch the window
	
	driver.switchTo().activeElement().sendKeys("Videos",Keys.ENTER);
	
     }
	
}
