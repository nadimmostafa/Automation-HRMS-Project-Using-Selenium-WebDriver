package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMS_TC016_drag_and_drop {
	static String url = "https://jqueryui.com/droppable/";
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// Enter to frame
		driver.switchTo().frame(0);
		/// Drag and Drop
		WebElement elementSource = driver.findElement(By.id("draggable"));
		WebElement elementTarget = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(elementSource, elementTarget).perform();
		Thread.sleep(6000);
		
		// exit from frmame
		driver.switchTo().defaultContent();
		
		//close window
		driver.close();
	}

}
