package org.nadim.HRMS.automationTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMS_TC019_Count_Links {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "https://www.google.com";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(key,path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
		
		//Implicitly wait until page has to be loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//close window
		driver.close();
	}

}
