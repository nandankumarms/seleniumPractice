package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		//Set System property for driver executables
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				//Code to launch chrome driver
				ChromeDriver driver=new ChromeDriver();
				
				//To wait for 2 seconds
				Thread.sleep(2000);
	            
				// To maximize the browser
				driver.manage().window().maximize();
				
				//Navigate to www.google.co.in
				driver.get("https://www.google.co.in/");
				
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				//Navigate to www.selenium.dev
				driver.navigate().to("https://www.selenium.dev/");
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				//Refresh
				driver.navigate().refresh();
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				//Go back previous page (<- back)
				driver.navigate().back();
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				//Go to previously opened page( Forward ->)
				driver.navigate().forward();
								
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				// To open the browser in full screen
				driver.manage().window().fullscreen();
				
				//To wait for 2 seconds
				Thread.sleep(2000);
				
				//To close Browser
				driver.close();
	}

}
