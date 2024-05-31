package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_dropdown {

private static WebElement dropdown;

public static void main (String []args ) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	    //Identify the Multi select dropdown
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		 
		 //Create the object of select class
	       Select s= new Select(dropdown);
	       
	     //SelectByIndex()
	       
	       for(int i=0;i<4;i++)
	       {
	    	   s.selectByIndex(i);
	    	   Thread.sleep(2000);
	       }
//	       List<WebElement> selectedOptions = s.getAllSelectedOptions();
//	       for(WebElement options: selectedOptions)
//	       {
//	    	   System.out.println(options.getText());
//	       }
       
	       s.deselectAll();
	}

}
