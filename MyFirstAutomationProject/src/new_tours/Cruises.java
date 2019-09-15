package new_tours;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.Driver;

public class Cruises {

	public static void main(String[] args) {
		/**
		 * Navigate to New Tours Home page
		 * click on Cruises link on the left navigation bar
		 * Validate URL and Page title
		 * getCurrentURL(), getTitle()
		 * 
		 * 
		 * URL --> http://newtours.demoaut.com/mercurtcruises.php
		 * Title --> Cruises: Mercury Tours
		 */
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Celine\\Downloads\\webDrivers\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
//		driver.navigate().to("http://newtours.demoaut.com/");
		sleep(2);
		
		driver.findElement(By.xpath("(//a)[5]")).click();
		
		sleep(3);
		
		String actualTitle = driver.getTitle();
		String actualURL = driver.getCurrentUrl();
		
		if ( actualTitle.equals("Cruises: Mercury Tours")) {
			System.out.println("Title check: pass");
		}else {
			System.out.println("title check: fail");
		}
		
		if (actualURL.equals("http://newstour.demoaut.com/mercurycruises.php")) {
			System.out.println("URL check: pass");
		}else {
			System.out.println("URL check: fail! Actual URL: " + actualURL);
		}
		
		sleep(5);
		driver.quit();
	}
	
	public static void sleep( int seconds ) {
		try {
			Thread.sleep(seconds * 1000);
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
