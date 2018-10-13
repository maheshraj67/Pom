package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageSitePage;

public class ManageSite extends Basetest {
	
	@Test
	public void addSite() throws InterruptedException
	{
		Reporter.log("Test Case:Adding a site",true);
		LoginPage l=new LoginPage(driver);
		
		//Enter username
		l.setUsername("phase3test");
		
		//Enter password
		l.setPassword("phase3test");
		
		Thread.sleep(3000);
		//Click on Login button
		l.clickLogin();
		
		GroupDashboardPage gp = new GroupDashboardPage(driver);
		
		Thread.sleep(3000);
		//Click Manage button
		gp.clickManageMenuButton();
		
		Thread.sleep(3000);
		//Click Manage Site button
		gp.clickManageSiteBtn();
		
		Thread.sleep(3000);
		//Click Add button
		gp.clickAddButton();
		
		Thread.sleep(3000);
		//Click on site button
		gp.clickSiteBtn();
		
		ManageSitePage sp=new ManageSitePage(driver);
		
		Thread.sleep(3000);
		//Enter site name
		sp.enterSiteNameTxtBox();
		
		Thread.sleep(3000);
		//Click on search text box
		sp.enterSearchMapTxtBox();
		
		Thread.sleep(3000);
		//Choose value from autoSuggestion
		sp.chooseAutoSuggestionValue();
		
		Thread.sleep(3000);
		//Click on apply button
		sp.clickApplyBtn();
		
		Thread.sleep(3000);
		//Choose a timezone
		sp.selectTimeZone();
		
		Thread.sleep(3000);
		//Enter site ref
		sp.enterSiteRef();
		
		Thread.sleep(3000);
		//Click on Add site button
		sp.clickAddSiteBtn();
		
		Thread.sleep(3000);
	}

}
