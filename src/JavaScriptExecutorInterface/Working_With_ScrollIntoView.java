package JavaScriptExecutorInterface;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch Firefox browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//use implicitlyWait method for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Navigate to amazon website
		driver.get("https://javatpoint.com");
		
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
	WebElement forum = driver.findElement(By.xpath("//p[text()='Forum']"));
	
	WebElement jmeter=driver.findElement(By.xpath("//p[text()='JMeter']"));
	
	List<WebElement> courses=driver.findElements(By.xpath("//div[@class='firsthomecontent']"));
	
//	je.executeScript("arguments[0].scrollIntoView(true);", forum,jmeter);
//	
//	Thread.sleep(2000);
//	je.executeScript("arguments[1].scrollIntoView(false)", forum,jmeter);
//	    Thread.sleep(2000);
//	    
	System.out.println(courses.get(0).getText());
	
	je.executeScript("arguments[0][0].scrollIntoView(true);", courses);
	    
		
	}

}
