package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMS_TC004_IFrame {

	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException {
		
		//set chrome browser property
		System.setProperty(key, path);
		
		//Open browser
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//perform login activity
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		// Entry Iframe activity
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Iqbal");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Asif");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		// exit Iframe activity
		driver.switchTo().defaultContent();
		
		// perform logout activity
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close browser
		driver.close();
	}

}
