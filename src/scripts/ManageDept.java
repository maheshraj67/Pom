package scripts;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.bulkUserUpload;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageDepartmentPage;
import pom.SiteDashboard;






public class ManageDept extends Basetest {

	
	

	@Test
	public void AddDept() throws InterruptedException
	{
		Reporter.log("Test Case:Adding the department",true);
		LoginPage l=new LoginPage(driver);

		//Enter username
		l.setUsername("phase3test");

		//Enter password
		l.setPassword("phase3test");

		Thread.sleep(3000);
		//Click on loginbutton
		l.clickLogin();

		GroupDashboardPage gp=new GroupDashboardPage(driver);
		
		Thread.sleep(3000);
		//Click on Manage menu button
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on Manage Departments
		gp.clickManageDepartments();
		
		Thread.sleep(3000);
		//Click on Add Button
		gp.clickAddButton();
		
		Thread.sleep(3000);
		//Click on department button
		gp.clickDepartment();
		
		Thread.sleep(3000);
		//Enter the text
		gp.enterDepartmentText();
		
		Thread.sleep(3000);
		//Click on submit button
		gp.clickSubmitBtn();
		Thread.sleep(3000);
	}

	
	@Test
	public void editDepartment() throws InterruptedException
	{
		Reporter.log("Test Case: Editing the department",true);
		LoginPage l=new LoginPage(driver);

		//Enter username
		l.setUsername("phase3test");

		//Enter password
		l.setPassword("phase3test");

		Thread.sleep(3000);
		//Click on loginbutton
		l.clickLogin();

		GroupDashboardPage gp=new GroupDashboardPage(driver);
		
		Thread.sleep(3000);
		//Click on Manage menu button
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on Manage Departments
		gp.clickManageDepartments();
		
		Thread.sleep(3000);
		//Click on edit button
		gp.clickeditDepartment();
		
		Thread.sleep(3000);
		//Edit the department name
		gp.entereditDeptText();
		
		Thread.sleep(3000);
		//Click submit button
		gp.clickeditSubmitBtn();
		
		Thread.sleep(3000);
	}

}
