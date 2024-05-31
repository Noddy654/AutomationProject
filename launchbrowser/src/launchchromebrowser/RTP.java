package launchchromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class RTP {

	static WebDriver driver;

	public static void main(String args) {
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your browser name");
		String browser = sc.next();
		
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
			}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
			}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
           System.out.println("Invalid browser");
			
		
		
		}
		
		

	}
}}