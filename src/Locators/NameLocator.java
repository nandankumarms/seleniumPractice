package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		//Set System property
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				//Launch chrome browser
				WebDriver driver=new ChromeDriver();
				
				//Navigate to https://www.amazon.com/ web site
				driver.get("https://www.amazon.com/");
				
				//find search box element using name Locator
				driver.findElement(By.name("field-keywords")).sendKeys("Laptop");
				
				//wait for 2 seconds
				Thread.sleep(2000);
				
				//Find search button and click on it.
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				
				//close the browser
				driver.close();
				
				
	}

}
