package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.bulkUserUpload;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageDepartmentPage;
import pom.ManageUserPage;
import pom.ManageUsersClientLevel;
import pom.SiteDashboard;

public class ManageUser extends Basetest {
	
	@Test(enabled=false)
	public void AddUserClientlevel() throws InterruptedException
	{
		Reporter.log("Test Case:Adding user from client level",true);
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
		//Click on Manage users button
		gp.clickManageUserbtn();
		
		Thread.sleep(3000); 
		//Click on Add button
		gp.clickAddButton();
		
		Thread.sleep(3000);
		//Click on users button
		gp.clickUserBtn();
		
		
		ManageUserPage up=new ManageUserPage(driver);
		
		Thread.sleep(3000);
		//Enter the first name
		up.enterFirstNametextbox();
		
		Thread.sleep(3000);
		//Enter the emailaddress
		up.enterEmailaddressTxtBox();
		
		Thread.sleep(3000);
		//Enter the pin
		up.clickPinGeneratorBtn();
		
		Thread.sleep(3000);
		//Select the site
		up.selectSiteCheckBox();
		
		Thread.sleep(3000);
		//Click on the user type
		up.clickUserTypeBtn();;
		
		Thread.sleep(3000);
		//Select the field user
		up.clickFieldUserType();
		
		Thread.sleep(3000);
		//Click on the department
		up.clickDeptDropDownBtn();
		
		Thread.sleep(3000);
		//Click on select all
		up.clickSelectAllBtn();
		
		Thread.sleep(3000);
		//Click outside div
		up.clickBody();
		
		Thread.sleep(3000);
		//click on submit button
		up.clickSubmitBtn();
		
		Thread.sleep(3000);
		//Verify the user created
		
		//Refresh the page
		//up.refresh();
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//Verify site
		up.verifySite();
		
		Thread.sleep(3000);
		//Verify user is present
		up.verifyuserpresent();
		
		Thread.sleep(3000);
				
		
	}
	
	
	@Test
	public void  AddUser() throws InterruptedException 
	{
		Reporter.log("Test Case: Adding the user from site level",true);
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
		//click on client name
		gp.clickclientnamelink();

		Thread.sleep(3000);
		//click on the sitedashboard link
		gp.clickSiteDashboardLink();

		SiteDashboard s = new SiteDashboard(driver);
		
		Thread.sleep(3000);
		s.clicksettingstbtn();
		
		Thread.sleep(3000);
		//Click on Manage Department/User button
		s.clickmanagedeptbtn();
		
		ManageDepartmentPage dept=new ManageDepartmentPage(driver);
		
		Thread.sleep(3000);
		//Click on Add User
		dept.clickAddUserBtn();
		
		Thread.sleep(3000);
		//Select the Admin user type
		dept.SelectAdminUserTypeCheckbox();
		
		Thread.sleep(3000);
		//Enter the First name
		dept.enterFirstNameTxtBox();
		
		Thread.sleep(3000);
		//Enter the email address
		dept.enteremailaddressTxtBox();
		
		Thread.sleep(3000);
		//Enter password
		dept.enterpassword();
		
		Thread.sleep(3000);
		//Enter confirm password
		dept.enterConfirmpwdField();
		
		Thread.sleep(3000);
		//Checkbox a dept
		dept.selectDeptCheckbox();
		
		Thread.sleep(3000);
		//Click on the submit button
		dept.clickSubmitUserBtn();
		
		
		
		Thread.sleep(3000);
	}
	
	@Test
	public void addBulkUser() throws InterruptedException
	{
		Reporter.log("Test Case: Adding Bulk User",true);
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
		//click on client name
		gp.clickclientnamelink();

		Thread.sleep(3000);
		//click on the sitedashboard link
		gp.clickSiteDashboardLink();

		SiteDashboard s = new SiteDashboard(driver);
		
		s.clicksettingstbtn();
		
		Thread.sleep(3000);
		//Click on Manage Department/User button
		s.clickmanagedeptbtn();
		
		ManageDepartmentPage dept=new ManageDepartmentPage(driver);
		
		Thread.sleep(3000);
		//Click on the Bulk Users Upload
		dept.clickbulkUserUploadBtn();
		
		Thread.sleep(3000);
		//Upload the file
		bulkUserUpload.writeCsvFile();
		
		Thread.sleep(3000);
		//Click on the browse button
		dept.clickBrowserBtn();
		
		
		
		Thread.sleep(3000);
		//Click on the upload button
		dept.clickuploadBtn();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void addDept() throws InterruptedException
	{
		Reporter.log("Test Case: Adding Department at Client level",true);
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
		//Click on Manage
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on department
		gp.clickManageDepartments();
		
		Thread.sleep(3000);
		//Click on Add drop down
		gp.clickAddButton();
		
		Thread.sleep(3000);
		//Click on Add department
		gp.clickDepartment();
		
		Thread.sleep(3000);
		//Enter dept name
		gp.enteDeptName();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void bulkUploadClientLevel() throws InterruptedException
	{
		Reporter.log("Test Case: Adding users bulk upload at client level",true);
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
		//Click on Manage
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on Users button
		gp.clickManageUserbtn();
		
		ManageUsersClientLevel mu=new ManageUsersClientLevel(driver);
		
		Thread.sleep(3000);
		//Click on site
		mu.clickSite();
		
		Thread.sleep(3000);
		//Click on bulk users upload
		mu.clickBulkUserUploadBtn();
		
		Thread.sleep(3000);
		//Upload the file
		bulkUserUpload.writeCsvFile();
		
		Thread.sleep(3000);
		//Click on browse
		mu.clickBrowseBtn();
		
		Thread.sleep(3000);
		//Click on upload button
		mu.clickUploadBtn();
		
		Thread.sleep(3000);
	
	}
	
	@Test
	public void autosearchAdd() throws InterruptedException
	{
		Reporter.log("Test Case: Adding users from auto search at client level",true);
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
		//Click on Manage
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on Users button
		gp.clickManageUserbtn();
		
		ManageUsersClientLevel mu=new ManageUsersClientLevel(driver);
		
		Thread.sleep(3000);
		//Click on site
		mu.clickSite();
		
		Thread.sleep(3000);
		//Click on autosearch text box
		mu.clickAutoSearchTxtBox();
		
		Thread.sleep(3000);
		//Click on the auto searched user
		mu.clickAutoSearchUser();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void editUser() throws InterruptedException
	{
		Reporter.log("Test Case: Editing users at client level",true);
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
		//Click on Manage
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click on Users button
		gp.clickManageUserbtn();
		
		ManageUsersClientLevel mu=new ManageUsersClientLevel(driver);
		
		Thread.sleep(3000);
		//Click on site
		mu.clickSite();
		
		Thread.sleep(3000);
		//Click on autosearch text box
		mu.clickEditUserBtn();
		
		Thread.sleep(3000);
		//Enter first name 
		mu.enterFstNameTxtField();
		
		Thread.sleep(3000);
		//Enter username
		mu.enterUsernameTxtField();
		
		Thread.sleep(3000);
		//Enter password
		mu.enterPwdTxtField();
		
		
		Thread.sleep(3000);
		//Enter confirm password
		mu.enterConfmPwdTxtField();
		
		Thread.sleep(3000);
		//Click on pin generate button
		mu.clickPinField();
		
		Thread.sleep(3000);
		//Enter phone number
		mu.enterPhTxtField();
		
		Thread.sleep(3000);
		//Select the first site
		mu.selectSiteCheckBox();
		
		Thread.sleep(3000);
		//Click on submit
		mu.clickSubmitBtn();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void  EditUSer() throws InterruptedException 
	{
		Reporter.log("Test Case: Editing the user from site level",true);
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
		//click on client name
		gp.clickclientnamelink();

		Thread.sleep(3000);
		//click on the sitedashboard link
		gp.clickSiteDashboardLink();

		SiteDashboard s = new SiteDashboard(driver);
		
		Thread.sleep(3000);
		s.clicksettingstbtn();
		
		Thread.sleep(3000);
		//Click on Manage Department/User button
		s.clickmanagedeptbtn();
	
		ManageUserPage msu=new ManageUserPage(driver);
		
		Thread.sleep(3000);
		//Click on a user to edit
		msu.clickUser();
		
		Thread.sleep(3000);
		//Enter First name
		msu.enterFrstNmeEdtTXtBox();
		
		Thread.sleep(3000);
		//Enter username
		msu.enterusrnmeEditTxtBox();
		
		Thread.sleep(3000);
		//Enter password
		msu.enterPwdEditTxtBox();
		
		Thread.sleep(3000);
		//Enter confirm password
		msu.enterConfirmEditPwdTxtBox();
		
		Thread.sleep(3000);
		//Re-generate pin
		msu.clickPinEditTxtBox();
		
		Thread.sleep(3000);
		//Select a country code
		msu.selectCountryCodeEdit();
		
		Thread.sleep(3000);
		//Enter phone number
		msu.enterPhTxtEditField();
		
		Thread.sleep(3000);
		//click on update button
		msu.clickUpdateUserProfileBtn();
		
		Thread.sleep(3000);
		
	}
	
	
}
