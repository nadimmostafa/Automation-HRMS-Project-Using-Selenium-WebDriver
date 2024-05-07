package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC008_KeyBoardActions_GoogleSearch {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Selenium Jobs");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		driver.close();
		
		
	}

}
