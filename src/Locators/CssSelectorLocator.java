package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		       //Set System property
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				//Launch chrome browser
				WebDriver driver=new ChromeDriver();
				
				/*Copy css-selector.html file present in the HTML_Pages folder to your device and run it.
				 * Navigate the window using the url name.
				 */
				
				driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/css_selector.html");
				
				Thread.sleep(2000);
				
				//Find User Name text field using cssSelector locator
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("John");
				
				//Find Password text field using cssSelector locator
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abcd@1234");
				Thread.sleep(2000);
				
				//close the browser
				driver.close();
	}

}
