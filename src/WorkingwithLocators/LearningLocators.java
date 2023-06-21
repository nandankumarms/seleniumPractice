package WorkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.id("small-searchterms")).click();
//		driver.findElement(By.id("small-searchterms"))
		driver.findElement(By.className("button-1 search-button")).click();
	}

}
