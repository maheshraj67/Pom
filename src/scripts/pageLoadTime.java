package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Basetest;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.SiteDashboard;
import pom.pageLoadingTime;

public class pageLoadTime extends Basetest {

	@Test
	
	public void pageLoad() throws InterruptedException{
	LoginPage l=new LoginPage(driver);

	//Enter username
	l.setUsername("phase3test");

	//Enter password
	l.setPassword("phase3test");

	//Thread.sleep(3000);
	//Click on loginbutton
	l.clickLogin();
	
	pageLoadingTime pl=new pageLoadingTime(driver);
	pl.superclientloading();

	pl.clickEle();
	
	pl.clicksitedashboardlink();
	
	pl.dashboardeleLoading();
	
	pl.clickChecklistBtn();
	
	pl.dashboardeleLoading();
	
	pl.clickPatrolReportBtn();
	
	pl.patrolReportEleLoading();
	
	pl.clickIssuesBtn();
	
	pl.clickViewIssueBtn();
	
	pl.issuesEleLoading();
	
	pl.clickWorkshiftBtn();
	
	pl.workshiftEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageLocationsBtn();
	
	pl.manageLocationsEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageChecklistBtn();
	
	pl.manageChecklistEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageWorkShiftBtn();
	
	pl.manageWorkshiftEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageUsersBtn();
	
	pl.manageUsersEleLoading();
	
	pl.clickDepartmentTab();
	
	pl.departmentEleLoading();
	
	pl.clickDepartmentEle();
	
	//pl.clickViewDeptBtn();
	
	//pl.viewDeptEleLoading();
	
	pl.clickUsersTab();
	
	pl.usersEleLoading();
	
	pl.clickUsersEleBtn();
	
	//pl.clickViewUserBtn();
	
	//pl.viewUsersEleLoading();
	
	//pl.clickUserUpdateBtn();
	
	//pl.usersEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageLocScheduleBtn();
	
	pl.locScheduleEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickManageEmailBtn();
	
	pl.manageEmailEleLoading();
	
	pl.clickSettingsBtn();
	
	pl.clickeditProfileBtn();
	
	pl.editProfileEleLoading();
	
	pl.clickChecklistBtn();
	
	pl.dashboardeleLoading();
	
	pl.clickImageGalleryBtn();
	
	pl.imageGalleryEleLoading();
	
	pl.clickChangeSiteBtn();
	
	pl.clickAllSitesBtn();
	
	pl.clientDashboardEleLoading();
	
	pl.clickManageBtn();
	
	pl.clickManageDropDown();
	
	pl.clickclientManageChecklistBtn();
	
	pl.clientManageChecklistEleLoading();
	
	pl.clickManageDropDown();
	
	pl.clickClientManageDepartmentBtn();
	
	pl.clientManageDptEleLoading();
	
	pl.clickManageDropDown();
	
	pl.clickClientUserBtn();
	
	pl.clientUserEleLoading();
	
	
	
	
	
}
}