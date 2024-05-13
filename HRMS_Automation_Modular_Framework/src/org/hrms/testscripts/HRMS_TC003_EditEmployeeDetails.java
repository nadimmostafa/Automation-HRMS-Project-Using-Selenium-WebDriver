package org.hrms.testscripts;

import org.hrms.lib.General;

public class HRMS_TC003_EditEmployeeDetails {

	public static void main(String[] args) throws InterruptedException {
		General g = new General();
		g.openApplication();
		g.login();
		Thread.sleep(3000);
		g.enterToFrame();
		
		g.editEmployeeDetails();
		Thread.sleep(3000);
		
		g.exitFromFrame();
		g.logout();
		Thread.sleep(3000);
		g.closeApplication();

	}

}
