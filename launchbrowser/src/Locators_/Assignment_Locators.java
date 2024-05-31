package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Selection;

public class Assignment_Locators {

	public static void main (String []args ) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//Using first name
		driver.findElement(By.name("firstname")).sendKeys("Krati");
	
		//Using last name
		driver.findElement(By.name("lastname")).sendKeys("Agarwal");
		
		
		//Using user name
		WebElement usernameTextField= driver.findElement(By.id("u_0_g_xm"));
		usernameTextField.sendKeys("Krati@123");
		
		//Using password 
		WebElement passwordTextField= driver.findElement(By.id("password_step_input"));
		passwordTextField.sendKeys("kaa@100");
		
		//Using Dropdown
		WebElement testDropdown= driver.findElement(By.name("birthday_day"));
		Object test;
		Selection dropDown =new Selection (test dropDown);
		Dropdown.selectByindex(5);
		
		//using  Radiobutton
		
		driver.findElement(By.xpath("//label[@Gender='1'.size())];   
       
				
        //Using submitbutton
	    WebElement submitButton=driver.findElement(By.className("_9bq4"));
	    submitButton.click();
	
	}
}