package org.nadim.HRMS.automationTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC006_KeyBoardAction {

	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Set driver property
		System.setProperty(key, path);
		
		//Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the testing application
		driver.navigate().to(url);
		//Maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Perform login activity
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		
		//Perform Keyboard Actions
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//Perform logout action
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close browser window
		driver.close();
	}

}
