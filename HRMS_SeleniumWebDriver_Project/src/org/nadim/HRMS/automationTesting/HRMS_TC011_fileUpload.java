package org.nadim.HRMS.automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMS_TC011_fileUpload {
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
		Thread.sleep(3000);
		
		//login
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.name("Submit"))));
		
		//click on login button
		driver.findElement(By.name("Submit")).click();
		
		//mouse over 
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		
		// enter to frame
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Iqbal");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Asif");
		Thread.sleep(3000);
		
		// file upload
		driver.findElement(By.xpath("//*[@id='photofile']")).sendKeys("C:\\Users\\NADIM MOSTAFA\\Downloads\\uplodAsif.png");
		
		//submit form
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		
		// exit from frame
		driver.switchTo().defaultContent();
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close browser window
		driver.close();

	}

}
