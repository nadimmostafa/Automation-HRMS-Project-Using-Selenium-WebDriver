package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMS_TC009_Dropdown_Checkbox {
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
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		//Enter to frame
		driver.switchTo().frame("rightMenu");
		Select s = new Select(driver.findElement(By.name("loc_code")));
		s.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		
		driver.findElement(By.name("loc_name")).sendKeys("0524");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		
		//check box
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		
		//delete
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		
		//Exit from frame
		driver.switchTo().defaultContent();
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		
		//close
		driver.close();
		
	}

}
