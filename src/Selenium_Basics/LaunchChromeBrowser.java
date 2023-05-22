package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//Set System property for driver executables
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Code to launch chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//To wait for 2 seconds
		Thread.sleep(2000);
		
		//To close Browser
		driver.close();
	}

}
