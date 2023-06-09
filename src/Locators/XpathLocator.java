package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		//Set System property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		/*Copy xpath.html file present in the HTML_Pages folder to your device and run it.
		 * Navigate the window using the url name.
		 */
		
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/xpath.html");
		
		Thread.sleep(2000);
		
		//Find User Name text field using absolute xpath
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("John");
		
		//Find Password text field using absolute xpath
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		
		//Find "Sign on" Button on web page and click on it. Use Absolute Xpath to find the element
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		
		
		//Repeat the Above steps using relative xpath
		
		////Find User Name text field using relative xpath
		driver.findElement(By.xpath("//input[1]")).sendKeys("John");
		
		//Find Password text field using relative xpath
		driver.findElement(By.xpath("//input[2]")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		
		//Find "Sign on" Button on web page and click on it. Use relative Xpath to find the element
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
