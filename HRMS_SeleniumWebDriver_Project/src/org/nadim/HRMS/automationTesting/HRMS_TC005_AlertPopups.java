package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC005_AlertPopups {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException {
		//set chrome browser driver property
		System.setProperty(key, path);
		
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//enter/navigate to application URL
		driver.navigate().to(url);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		// switch to alert
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close browser window
		driver.close();
	}

}
