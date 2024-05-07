package org.nadim.HRMS.automationTesting;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC013_windowHandlers {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "G:\\02. Automation Testing\\Automation By NareshIT\\WindowHandlers\\multipleWindow.html";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		
		// click on window 2 btn
		driver.findElement(By.linkText("Window 02")).click();
		Thread.sleep(3000);
		
		//click on window 3 btn
		driver.findElement(By.linkText("Window 03")).click();
		Thread.sleep(3000);
		
		//navigate to main window
		ArrayList<String> al = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(al.get(0));
		Thread.sleep(3000);
		//close browser
		driver.quit();	
		
	}

}
