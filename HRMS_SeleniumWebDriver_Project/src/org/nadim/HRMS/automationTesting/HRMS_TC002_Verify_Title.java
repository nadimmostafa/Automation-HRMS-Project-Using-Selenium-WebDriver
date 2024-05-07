package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC002_Verify_Title {

	public static void main(String[] args) throws InterruptedException {
		// define all test Data into variable;
		String key = "webdriver.chrome.driver";
		String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		String url = "http://183.82.103.245/nareshit/login.php";
		String userName = "nareshit";
		String password = "nareshit";
		String title1 = "OrangeHRM - New Level of HR Management";
		String title2 = "OrangeHRM";

		System.setProperty(key, path);
		// open browser
		WebDriver driver = new ChromeDriver();
		// enter url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// verify title of HRMS
		if (driver.getTitle().equals(title1)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Not Matched");
		}
		
		// perform Login activity
		System.out.println("After Login into the Application");
		
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		// verify title of the application
		if (driver.getTitle().equals(title2)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Not Matched");
		}
		
		// perform logout activity
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);

		// close browser window
		driver.close();
	}
}
