package Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMicrosoftEdge {
	public static void main(String[] args) throws InterruptedException {
		//Set system Property for driver.
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				
				//Launch Microsoft Edge Browser
				EdgeDriver driver=new EdgeDriver();
				
				//Wait for 2 seconds
				Thread.sleep(2000);
				
				//Close Browser
				driver.close();
	}

}
