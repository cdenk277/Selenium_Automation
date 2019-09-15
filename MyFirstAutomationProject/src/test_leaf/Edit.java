package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.Driver;
import new_tours.Cruises;
public class Edit {

	public static void main(String[] args) {
		/**
		 * Step 1 Navigate to test leaf home page
		 * Step 2 Click on Edit link
		 * Step 3 validate page header --> Work with Edit Fields
		 * Step 4 Enter your email address
		 */
//		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver = Driver.getDriver("firefox");
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElement(By.linkText("Edit")).click();
		String header = driver.findElement(By.tagName("h1")).getText();
		
		
		if ( header.equals("Work with Edit Fields")) {
			System.out.println("Header validation is passed");
		}else {
			System.out.println("Header validation is failed");
		}
		
		Cruises.sleep(2);
		
		driver.findElement(By.id("email")).sendKeys("someemail@gmail.com");
		Cruises.sleep(2);
		driver.findElement(By.cssSelector("[value='Append ']")).sendKeys(" appending text");
		String value = driver.findElement(By.name("username")).getAttribute("value");
		/*
		 * to get text out of text box, yopu should use getAttribute("value") method
		 */
		System.out.println(value);
		Cruises.sleep(3);
		//input[@name='username'] --> xpath
		/*
		 * // relative xpath
		 * input --> tag name
		 * name --> attribute of the element
		 * 'username' --> value of an attribute
		 */
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		Cruises.sleep(2);
		
		WebElement webElement = driver.findElement(By.cssSelector("[diabled='true']"));
		boolean isDisabled = !driver.findElement(By.cssSelector("[disabled='true']")).isEnabled();
		System.out.println(isDisabled);
		
		Cruises.sleep(5);
		
//		driver.quit();
	}
}
