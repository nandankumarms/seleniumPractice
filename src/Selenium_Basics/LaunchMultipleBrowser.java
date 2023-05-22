package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMultipleBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//set system properties
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		
		//Creating he reference of WebDriver type;
		WebDriver driver;
		
		// Launch Chrome Browser
		driver=new ChromeDriver();
		
		//Close Chrome Browser
		driver.close();
		Thread.sleep(1000);
		
	   //Launch Firefox Browser
		driver=new FirefoxDriver();
		
       //Launch Microsoft Edge browser
		driver=new EdgeDriver();
		
		
		driver.close();
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
