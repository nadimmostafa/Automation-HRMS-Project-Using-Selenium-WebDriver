package org.nadim.HRMS.automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMS_TC010_waitStatement {
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
		
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofNanos(3));
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.name("Submit"))));
		
		// click on login btn
		driver.findElement(By.name("Submit")).click();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//logout
		driver.findElement(By.partialLinkText("Log")).click();
		
		Thread.sleep(3000);
		
		//close
		driver.close();
		
	}

}
