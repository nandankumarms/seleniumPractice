package Selenium_Basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;



public class LaunchUserPreferredBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your preferred browser. Example chrome, firefox or edge :");
		String browser=scanner.next();
		
		if(browser.equalsIgnoreCase("chrome")) {
			//set system property
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			//Launch Chrome browser
			driver=new ChromeDriver();
			
			
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//close browser
			driver.close();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//set system property
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			
			//Launch Firefox browser
			driver=new FirefoxDriver();
			
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//close browser
			driver.close();
		}
		else if(browser.equalsIgnoreCase("edge") || browser.equalsIgnoreCase("msedge")) {
			//set system property
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			
			//Launch Firefox browser
			driver=new EdgeDriver();
			
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//close browser
			driver.close();
		}
		
		else {
			System.out.println(browser+" Browser not supported");
		}
	}

}
