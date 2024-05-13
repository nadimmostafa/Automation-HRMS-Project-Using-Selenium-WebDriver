package org.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//standard rule:To provide TestData and Objects related to whole application
	
	//==== WebDriver Reference
	WebDriver driver;
	
	//========= TestData ==========//
	// Application URL and Login Related TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String userName="nareshit";
	public String password ="nareshit";
	
	//Browser Related TestData
	public String path = "G:\\Software\\BrowserDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	public String key = "webdriver.chrome.driver";
	
	//Add Employee
	public String firstName= "Asif";
	public String lastName = "Iqbal";
	
	
	//edit employee
	public String editFirstName="Mustak";
	public String editLastName="Kafi";
	
	
	//============== testData related Objects ===============//
	
	// Login related Objects
	public String txtUserNameField = "txtUserName";
	public String txtPasswordField = "txtPassword";
	public String loginBtn = "Submit";
	public String logoutLinkText = "Logout";
	
	//Frame
	public String frameName="rightMenu";
	
	//Add employee
	public String xPathAddBtn = "//input[@value='Add']";
	public String lNameTxtField = "txtEmpLastName";
	public String fNameTxtField = "txtEmpFirstName";
	public String idSaveBtn = "btnEdit";
	
	//edit employee
	public String xPathName = "//*[@id='standardView']/table/tbody/tr[2]/td[3]/a";
	public String editFName="txtEmpFirstName";
	public String editLName ="txtEmpLastName";
	public String editBtnByName = "EditMain";
	public String saveEditInfoById = "btnEditPers";
	
}
