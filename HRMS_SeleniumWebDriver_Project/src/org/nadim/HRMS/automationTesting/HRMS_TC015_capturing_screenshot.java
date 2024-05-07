package org.nadim.HRMS.automationTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC015_capturing_screenshot {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//login
		try {
			driver.findElement(By.name("txtUserName")).sendKeys(userName);
			driver.findElement(By.name("txtpassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
		}catch(Exception e) {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("G:\\02. Automation Testing\\Automation By NareshIT\\File\\login.png"));
			driver.close();
		}
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		//close
		driver.close();
		
	}
}