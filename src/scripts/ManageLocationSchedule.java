package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageLocationSchedulePage;
import pom.SiteDashboard;

public class ManageLocationSchedule extends Basetest{
	
	@Test
	public void createLocationSchedule() throws InterruptedException
	{
		Reporter.log("Test Case: Add the location Schedule",true);
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
		
		SiteDashboard s=new SiteDashboard(driver);
		
		Thread.sleep(3000);
		s.verifysettingsbtn();
		//click on settings menu
		s.clicksettingstbtn();
		
		Thread.sleep(3000);
		//Click on Manage location Schedule
		s.clicklocationschedulebtn();
		
		ManageLocationSchedulePage ml=new ManageLocationSchedulePage(driver);
		
//		for(int i=0;i<100;i++)
//		{
		Thread.sleep(3000);
		//Click on Add schedule button
		ml.clickAddScheduleBtn();
		
		Thread.sleep(3000);
		//Enter location schedule name
		ml.enterScheduleName();
		
		Thread.sleep(3000);
		//Click on location toggle
		ml.clickLocationbtn();
		
//		Thread.sleep(3000);
//		//Select a location
//		ml.selectLocationValue();
		
		Thread.sleep(3000);
		//Select a location
		ml.chooseLocCheckbox();
		
		Thread.sleep(3000);
		//Click on save button
		ml.clickSaveBtn();
		
		Thread.sleep(3000);
		//Enter email
		ml.enterEmail();
		
		Thread.sleep(3000);
		//Click on save button
		ml.clickSaveAndCloseBtn();
		
		Thread.sleep(3000);
//		}
		
	}

}
