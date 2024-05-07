package org.nadim.HRMS.automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC017_Select_Only_Odd_CheckBox {
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
		
		//login into application
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		//Enter to the Frame
		driver.switchTo().frame("rightMenu");
		int rowCount = driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr")).size();
		System.out.println(rowCount);
		
		////*[@id="standardView"]/table/tbody/tr[1]/td[1]/input
		////*[@id="standardView"]/table/tbody/tr[1]/td[1]/input
		for(int i=1;i<=rowCount;i+=2) {
			driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
			Thread.sleep(2000);
		}
		//exit from the frame
		driver.switchTo().defaultContent();
		
		//logout from application
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//Close the application window
		driver.close();
	}

}
