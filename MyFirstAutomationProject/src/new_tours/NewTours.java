package new_tours;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Celine
 *New Tours automation demo
 */
public class NewTours {
	
	/**
	 * @author Celine
	 * @param args
	 * @throws InterruptedException 
	 */  
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please neter your first name: ");
		String fName = scanner.nextLine();
		System.out.print("Please neter your last name: ");
		String lName = scanner.nextLine();
		System.out.print("Please neter your phone number: ");
		String phone = scanner.nextLine();
		String email = generateEmail(fName, lName);
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TechCenture\\Downloads\\webDrivers\\chromedriver_win321\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
//		driver.findElement(By.name("userName")).sendKeys("mercury");
//		driver.findElement(By.name("password")).sendKeys("mercury");
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("userName")).sendKeys(email);
		
		/*
		 * Task:
		 * Enter First Name, Last Name and Phone Number
		 * create a private method to generate user email and return the email, 
		 * 	the method should accept 2 Strings (fName, lName) as parameters, return --> ali.ismoilov@someemail.net 
		 */
		Thread.sleep(5000);
		driver.quit();
	}
	
	private static String generateEmail ( String fName, String lName ) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(fName).append(".").append(lName).append("@gmail.com");
		return stringBuilder.toString().toLowerCase();
	}
}
