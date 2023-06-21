package JavaScriptExecutorInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_HiddenElements {
	public static void main(String[] args) throws InterruptedException {
//		Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
//		Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
//		use implicitly wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Navigate to website
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		
		driver.findElement(By.id("hide-textbox")).click();
		
		WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//legend[text()='Element Displayed Example']")));
		Thread.sleep(2000);
		je.executeScript("arguments[0].value='Nandan';", hiddenTextBox);
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
	}

}
