package org.nadim.HRMS.automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_TC014_WebTable {
	// define all test Data into variable;
	static String key = "webdriver.chrome.driver";
	static String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(key,path);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//login
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		executor.executeScript("arguments[0].click();",driver.findElement(By.name("Submit")));
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightMenu");
		
		//========= web table =============
		
		//retrieve total row in a page
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr"));
		int tableRow = elements.size();
		
		// retrieve col from a particular row
		int totalCol = driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr[1]/td")).size();
		
		//count total row*col
		int rowCol=driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr/td")).size();
		
		System.out.println(tableRow);
		System.out.println(totalCol);
		System.out.println(rowCol);
		Thread.sleep(3000);
		
		
		//========= retrieve a particular cell data from a table
		String text = driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr[1]/td[3]")).getText();
		System.out.println(text);
		
		//=== to retrieve row wise table data
		/*
		System.out.println("Employee ID     EmployeeName  JobTitle    EmpStstus  SubDevision   Superviser");
		for(int i=1;i<tableRow;i++) {
			for(int j=1;j<totalCol;j++) {
				System.out.print(driver.findElement(By
						.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td["+j+"]"))
							.getText() + "    ");
			}
			
			System.out.println();
		}
		
		*/
		
		for(int i=1;i<=tableRow;i++) {
			System.out.println(driver.findElement(By
					.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]"))
						.getText());
		}
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
