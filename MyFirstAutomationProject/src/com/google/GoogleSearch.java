package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Celine
 *Simple Google Search
 */
public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.google.com/");
		chromeDriver.findElement(By.name("q")).sendKeys("kirmizi mercimek tarifi");
	}

}
