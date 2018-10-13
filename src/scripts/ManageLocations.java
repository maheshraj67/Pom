package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.bulkLocationUpload;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageLocationsPage;
import pom.SiteDashboard;

public class ManageLocations extends Basetest{
	
	@Test
	public void createLocation() throws InterruptedException
	{
		Reporter.log("Test Case: Add the location",true);
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
		//Click on Manage locations
		s.clickmanagelocationsbtn();
		
		Thread.sleep(3000);
		
		ManageLocationsPage loc=new ManageLocationsPage(driver);
		
		//Click on Add Location 
		loc.clickaddlocationbtn();
		
		Thread.sleep(3000);
		//Enter location code
		loc.enterloccodevalue();
		
		Thread.sleep(3000);
		//Enter location name
		loc.enterlocnamevalue();
		
		Thread.sleep(3000);
		//Enter Address
		loc.enteraddressvalue();
		
		Thread.sleep(3000);
		//Enter Area
		loc.enterareavalue();
		
		Thread.sleep(3000);
		//Enter City
		loc.entercityvalue();
		
		Thread.sleep(3000);
		//Enter Unit Name
		loc.enterunitnamevalue();
		
		Thread.sleep(3000);
		//Enter Incharge name
		loc.enterinchargevalue();
		
		Thread.sleep(3000);
		//Click create
		loc.clickacreatebtn();
		
		Thread.sleep(3000);		 
		
	}

	@Test
	public void editLocation() throws InterruptedException{

		Reporter.log("Test Case:Editing the location",true);
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
		//click on settings menu
		s.clicksettingstbtn();
		
				
		Thread.sleep(3000);
		//Click on Manage locations
		s.clickmanagelocationsbtn();
				
		ManageLocationsPage loc=new ManageLocationsPage(driver);
		
		Thread.sleep(3000);
		//Click on edit location
		loc.clickeditlocation();
		
		Thread.sleep(3000);
		//Enter location code
		loc.entereditloccodevalue();
		
		Thread.sleep(3000);
		//Enter location name
		loc.entereditlocnamevalue();
		
		Thread.sleep(3000);
		//Enter Address
		loc.entereditaddressvalue();
		
		Thread.sleep(3000);
		//Enter Area
		loc.entereditareavalue();
		
		Thread.sleep(3000);
		//Enter City
		loc.entereditcityvalue();
		
		Thread.sleep(3000);
		//Enter Unit Name
		loc.entereditunitnamevalue();
		
		Thread.sleep(3000);
		//Enter Incharge name
		loc.entereditinchargevalue();
		
		Thread.sleep(3000);
		//Click on the save button
		loc.clicksavebtn();
		
		Thread.sleep(3000);
		
	}

	@Test
	public void bulkLocation() throws InterruptedException
	{
		Reporter.log("Test Case: Bulk Location added",true);
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
		//click on settings menu
		s.clicksettingstbtn();
		
				
		Thread.sleep(3000);
		//Click on Manage locations
		s.clickmanagelocationsbtn();
		
//		String locCode=Excel.getCellValue(PATH,"Sheet1", 1, 0);
//		
//		String locCode1=Excel.getCellValue(PATH, "Sheet1", 2, 0);
//		
//		System.out.println(locCode1);
			
		bulkLocationUpload.writeCsvFile();
		ManageLocationsPage loc=new ManageLocationsPage(driver);
		
		Thread.sleep(3000);
		//Click on Bulk Location Upload button
		loc.clickBulkLocation();
		
		Thread.sleep(3000);
		//Upload bulk location file
		loc.uploadBulkLoc();
		
		Thread.sleep(3000);
		//Click on the upload button
		loc.clickUploadBtn();
		
		Thread.sleep(3000);
	}

	@Test
	public void disablingLocation() throws InterruptedException
	{
		Reporter.log("Test Case: Disabling the location",true);
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
		//click on settings menu
		s.clicksettingstbtn();
		
				
		Thread.sleep(3000);
		//Click on Manage locations
		s.clickmanagelocationsbtn();
				
		ManageLocationsPage loc=new ManageLocationsPage(driver);
		
		Thread.sleep(3000);
		//Click on the disable button
		loc.clickDisablebtn();
		
		Thread.sleep(3000);
		 
		loc.clickDisableBtn();
		
		Thread.sleep(3000);
	}

	
}
