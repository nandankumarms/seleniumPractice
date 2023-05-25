package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		//Set System property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to https://demowebshop.tricentis.com/ web site
		driver.get("https://demowebshop.tricentis.com/");
		
		//Find the search box and enter "Mobile". Use Id locators to find element on web page.
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		//Wait for 2 seconds
		Thread.sleep(2000);
		
		//Find newsletter email search box and send your email address. Use Id locators to find element on web page.
		driver.findElement(By.id("newsletter-email")).sendKeys("abcd@123.com");
		
		//Wait for 2 seconds
				Thread.sleep(2000);
		
		//Find radio buttons on webpage and click on them. Use Id locators to find element on web page.
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(2000);
		
		//Find the Vote button on the webpage and click on it. Use Id locators to find element on web page.
		driver.findElement(By.id("vote-poll-1")).click();
		Thread.sleep(4000);
		
		//close the Browser
		driver.close();
		
		
		
		
	}

}
