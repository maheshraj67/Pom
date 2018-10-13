package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import pom.GroupDashboardPage;
import pom.IssuesPage;
import pom.LoginPage;
import pom.SiteDashboard;

public class Issues extends Basetest{
	
	@Test
	public void createIssue() throws InterruptedException
	{
//		Reporter.log("Test Case:Creating an issue",true);
//		LoginPage l=new LoginPage(driver);
//
//    	//Enter username
//		l.setUsername("phase3test");
//
//		//Enter password
//		l.setPassword("phase3test");
//
//		Thread.sleep(3000);
//		//Click on loginbutton
//		l.clickLogin();
//
//		GroupDashboardPage gp=new GroupDashboardPage(driver);
//
//		Thread.sleep(3000);
//		//click on client name
//		gp.clickclientnamelink();
//
//		Thread.sleep(3000);
//		//click on the sitedashboard link
//		gp.clickSiteDashboardLink();
//
//		SiteDashboard s = new SiteDashboard(driver);
//
//		Thread.sleep(3000);
//		//Click on the Issues menu
//		s.clickIssues();
//		
//		Thread.sleep(3000);
//		//Click on view issues button
//		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
//		iss.clickViewIssueBtn();
		
		//Call the issue api
		//for(int i=0;i<10000;i++)
		//{
		iss.issues_api();
		//}
		Reporter.log("\n Issue Created successfully",true);
	}
	
	@Test
	public void changestatus() throws InterruptedException
	{
		Reporter.log("Test Case:Changing the status of an issue",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
		Thread.sleep(3000);
		//Call the issue api
		iss.issues_api();
		
		//Click on the filter options
		Thread.sleep(3000);
		iss.clickfilter();
		
		Thread.sleep(3000);
		//Click on the fromdate
		iss.clickfromDate();
		
		Thread.sleep(3000);
		//Select the month
		iss.selectmonDatePicker();
		
		Thread.sleep(3000);
		//Select the year
		iss.selectyearDatePicker();
		
		iss.clickdate();
		
		Thread.sleep(3000);
		//Click on Apply changes	
		iss.clickapplychange();
		
		Thread.sleep(3000);
		
		//Refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//Verify the issueId
		iss.verifyissueID();
			
		Thread.sleep(3000);
		//Click on the issueID
		//iss.clickissueId();
		
		Thread.sleep(3000);
		//Click on the status
		iss.clickchangeStatus();
			
		Thread.sleep(3000);
		//verify status and change the status
		iss.verifystatus();
		
		Thread.sleep(3000);
		
		//iss.date();
		
		//Thread.sleep(3000);	
		
		Reporter.log("Issue status changed successfully",true);
	
	}
	
	@Test
	public void shareIssue() throws InterruptedException
	{
		Reporter.log("Test Case: Sharing the issue details",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
		Thread.sleep(3000);
		//Call the issue api
		iss.issues_api();
		
		//Refresh the page
		driver.navigate().refresh();
				
		Thread.sleep(5000);
		//Verify the issueId
		iss.verifyissueID();
		
		Thread.sleep(5000);
		//Click on share issue
		iss.clicksharebtn();
		
		Thread.sleep(3000);
		//Enter email address
		iss.enteremailId();
		
		Thread.sleep(3000);
		//Share the issue
		iss.clickShare();
		
		Thread.sleep(3000);
		
		//Reporter.log("Issue details shared successfully",true);
	}
	
	@Test
	public void commentIssue() throws InterruptedException
	{
		Reporter.log("Test Case:Commenting on the issue in the issue details page",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
		Thread.sleep(3000);
		//Click on the issue ID
		iss.clickissueId();
		
		Thread.sleep(3000);	
		//Enter the message
		iss.entercomment();
		
		Thread.sleep(3000);
		//Upload image
		iss.uploadImage();
		
		Thread.sleep(3000);
		//Click on send button
		iss.clickSendBtn();
		
		Thread.sleep(3000);
		//Reporter.log("Commented on issue sucessfully",true);
	}
	
	@Test
	public void filterIssue() throws InterruptedException
	{
		Reporter.log("Test Case:Filter the issue",true);
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

		Thread.sleep(3000);;
		//click on the sitedashboard link
		gp.clickSiteDashboardLink();

		SiteDashboard s = new SiteDashboard(driver);

		Thread.sleep(3000);
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
	
		//Click on the filter options
		Thread.sleep(3000);
		iss.clickfilter();
				
		Thread.sleep(3000);
		//Click on the fromdate
		iss.clickfromDate();
				
		Thread.sleep(3000);
		//Select the month
		iss.selectmonDatePicker();
			
		Thread.sleep(3000);
		//Select the year
		iss.selectyearDatePicker();
				
		iss.clickdate();
							
		Thread.sleep(3000);
		//Select the department filter
		iss.selectDeptFilter();
		
		Thread.sleep(3000);
		//Select the user filter
		iss.selectUserFilter();
		
		Thread.sleep(3000);
		//Select the status
		iss.selectStatus();
		
		Thread.sleep(3000);
		//Click on filter
		iss.clickapplychange();
		
		Thread.sleep(3000);
	}

	@Test
	public void changeDeptUser() throws InterruptedException
	{
		Reporter.log("Test Case:Changing the department and the user",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
		Thread.sleep(3000);
		//Call the issue api
		iss.issues_api();
		
		//Click on the filter options
		Thread.sleep(3000);
		iss.clickfilter();
		
		Thread.sleep(5000);
		//Click on the fromdate
		iss.clickfromDate();
		
		Thread.sleep(3000);
		//Select the month
		iss.selectmonDatePicker();
		
		Thread.sleep(3000);
		//Select the year
		iss.selectyearDatePicker();
		
		iss.clickdate();
		
		Thread.sleep(3000);
		//Click on Apply changes	
		iss.clickapplychange();
		
		Thread.sleep(3000);
		
		//Refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//Verify the issueId
		iss.verifyissueID();
		
		Thread.sleep(3000);
		//Change due date
		iss.clickassignedTo();
		
		Thread.sleep(3000);
		//Change the department
		iss.selectDepartment();
		
		Thread.sleep(3000);
		//Change the user
		iss.selectUser();
		
		Thread.sleep(3000);
		//Click on the Assign button
		iss.clickAssignBtn();
		
		Thread.sleep(3000);
	}

	@Test
	public void changeDueDate() throws InterruptedException
	{
		Reporter.log("Test Case:Changing the due date",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on view issues button
		iss.clickViewIssueBtn();
		
		Thread.sleep(3000);
		//Call the issue api
		iss.issues_api();
		
		//Refresh the page
		driver.navigate().refresh();
				
		Thread.sleep(3000);
		//Verify the issueId
		iss.verifyissueID();
		
		Thread.sleep(5000);
		//Click on the due date
		iss.clickDueDate();
		
		Thread.sleep(3000);
		//Click the due date text box
		iss.clickDuedateTxtBox();
		
		Thread.sleep(3000);
		//Click on the month picker
		iss.clickSelectMonth();
		
		Thread.sleep(3000);
		//Click on the partiuclar date
		iss.clickdate();
		
		Thread.sleep(3000);
		//Click on the Change button
		iss.clickChangeBtn();
		
		Thread.sleep(3000);
		
	}

	@Test
	public void createWebIssue() throws InterruptedException
	{
		Reporter.log("Test Case:Creating issue from web",true);
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
		//Click on the Issues menu
		s.clickIssues();
		
		IssuesPage iss=new IssuesPage(driver);
		
		Thread.sleep(3000);
		//Click on raise an issue button
		iss.clickRaiseIssueBtn();
		
		Thread.sleep(3000);
		//Enter issue name
		iss.enterIssueName();
		
		Thread.sleep(2000);
		//Select location
		iss.selectIssLocField();
		
		Thread.sleep(2000);
		//Select department
		iss.selectIssDeptField();
		
		Thread.sleep(2000);
		//Select due in
		iss.selectIssDueField();
		
		Thread.sleep(2000);
		//Click on submit
		iss.clickSubmitBtn();
		
		Thread.sleep(3000);
		
		Reporter.log("Issue succesfully raised from web app",true);
	}
	

}

