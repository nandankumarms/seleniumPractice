package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		//Set System property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		/*Copy tagname.html file present in the HTML_Pages folder to your device and run it.
		 * Navigate the window using the url name.
		 */
		
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Desktop/tagname.html");
		
		Thread.sleep(2000);
		
		//Find the User Name text field using tagName() locator
		driver.findElement(By.tagName("input")).sendKeys("John");
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
