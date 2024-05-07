package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC012_jsExecutor {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//login
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		//Javascript executor
		//WebElement element = driver.findElement(By.name("Submit"));
		
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.name("Submit")));
		Thread.sleep(3000);
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close
		driver.close();
		
	}

}
