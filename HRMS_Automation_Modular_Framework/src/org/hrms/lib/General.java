package org.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global {
	
	public void openApplication() {
		System.setProperty(key, path);
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	public void login() {
		driver.findElement(By.name(txtUserNameField)).sendKeys(userName);
		driver.findElement(By.name(txtPasswordField)).sendKeys(password);
		driver.findElement(By.name(loginBtn)).click();
	}
	
	public void logout() {
		driver.findElement(By.linkText(logoutLinkText)).click();
	}
	public void closeApplication() {
		driver.close();
	}
	
	public void enterToFrame() {
		driver.switchTo().frame(frameName);
		System.out.println("Enter to Frame");
	}
	
	public void exitFromFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit From Frame");
	}
	
	public void addNewEmployee() {
		driver.findElement(By.xpath(xPathAddBtn)).click();
		driver.findElement(By.name(fNameTxtField)).sendKeys(firstName);
		driver.findElement(By.name(lNameTxtField)).sendKeys(lastName);
		driver.findElement(By.id(idSaveBtn)).click();
	}
	
	public void editEmployeeDetails() throws InterruptedException {
		driver.findElement(By.xpath(xPathName)).click();
		
		driver.findElement(By.name(editBtnByName)).click();
		
		driver.findElement(By.name(editFName)).clear();
		driver.findElement(By.name(editFName)).sendKeys(editFirstName);
		Thread.sleep(3000);
		
		driver.findElement(By.name(editLName)).clear();
		driver.findElement(By.name(editLName)).sendKeys(editLastName);
		Thread.sleep(3000);
		
		driver.findElement(By.id(saveEditInfoById)).click();
		Thread.sleep(3000);
		
	}
}
