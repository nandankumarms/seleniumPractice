package Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		//Set system Property for driver.
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch Firefox Browser
		FirefoxDriver driver=new FirefoxDriver();
		
		//Wait for 2 seconds
		Thread.sleep(2000);
		
		//Close Browser
		driver.close();
	}

}
