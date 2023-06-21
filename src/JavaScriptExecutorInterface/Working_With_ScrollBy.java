package JavaScriptExecutorInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ScrollBy {
	public static void main(String[] args) {
		//Set System property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		// Use implicitlyWait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to website
		driver.get("https://javatpoint.com");
		
		//Scroll by 1000 pixels using JavaScriptExecutor method
		
		//Typecast the driver reference to JavaScriptExecutor type
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		// Scroll by 1000 pixels
		je.executeScript("window.scrollBy(0,1000)");
		
		
		//Again scroll by 1000 pixels from where it was present
		je.executeScript("window.scrollBy(0,2000)");
		
		
		
		
	}

}
