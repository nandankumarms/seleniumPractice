package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to Demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Use relative xpath to find element.
		
		//Click on Register Text(Hyperlink). 
		driver.findElement(By.xpath("//a[@ class='ico-register']")).click();
		Thread.sleep(2000);
		
		//Select radio button (male or female)
		driver.findElement(By.xpath("//input[@ id='gender-male']")).click();
		Thread.sleep(2000);
		//Find First Name text field web element and enter your First Name
		driver.findElement(By.xpath("//input[@ id='FirstName']")).sendKeys("John");
		Thread.sleep(2000);
		
		//Find Last Name text field web element and enter your Last Name
		driver.findElement(By.xpath("//input[@ id='LastName']")).sendKeys(" A B");
		Thread.sleep(2000);
		
		//Find email text field web element and enter your email
		driver.findElement(By.xpath("//input[@ id='Email']")).sendKeys("John@gmail.com");
		Thread.sleep(2000);
		
		//Find password text field element and enter password 
		driver.findElement(By.xpath("//input[@ id='Password']")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		
		//find confirm password text field and and enter password again
		driver.findElement(By.xpath("//input[@ id='ConfirmPassword']")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		
		//Find Register button on web page and click on it.
		driver.findElement(By.xpath("//input[@ id='register-button']")).click();
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
		
	}

}
