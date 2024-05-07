package org.nadim.HRMS.automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMS_TC018_Print_Dropdown_Values {
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

		// login into application
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		// Enter to the Frame
		driver.switchTo().frame("rightMenu");
		
		// Retrieve Drop down values
		Select s = new Select(driver.findElement(By.name("loc_code")));
		List<WebElement> options = s.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		//exit from frame
		driver.switchTo().defaultContent();
		
		//logout from application
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//Close the application window
		driver.close();
	}

}
