package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMS_TC003_Mouseover {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// perform login activity
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		//Mouse Hover 
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(8000);
		
		// Frame Entry point
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.className("backbutton")).click();
		
		// Frame exit point
		driver.switchTo().defaultContent();
		
		//perform logout activity
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close browser
		driver.close();
	}
}
