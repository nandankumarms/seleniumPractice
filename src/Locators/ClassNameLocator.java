package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) {
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to website
		driver.get("https://demowebshop.tricentis.com/");
		
		//Find Register button on web page using className Locator and click on it.
		driver.findElement(By.className("ico-register")).click();
		
		//Close browser
		driver.close();
	}

}
