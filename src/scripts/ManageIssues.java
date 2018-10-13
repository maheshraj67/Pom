package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import pom.GroupDashboardPage;
import pom.LoginPage;
import pom.ManageIssuesPage;
import pom.SiteDashboard;

public class ManageIssues extends Basetest{

	@Test
	public void createIssues() throws InterruptedException
	{
		Reporter.log("Test Case: Creating Issue settings",true);
		
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
		//Click on ManageIssues button
		gp.clickManageIssuesBtn();
		
		ManageIssuesPage issue=new ManageIssuesPage(driver);
		
		/// WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("addFieldsForm")));Thread.sleep(3000);
		//Click on AddField
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Checkbox
		issue.clickcheckboxlink();
		
		String value="Checkbox";
		
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.enterfieldvalue1textbox();
		
		//Thread.sleep(3000);
		issue.clickplusbtn();
		
		//Thread.sleep(3000);
		issue.enterfieldvalue2textbox();
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
			//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("addFieldsForm")));
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("addFieldsForm")));  
		//Thread.sleep(3000);
		//Click on Date
		issue.clickdatelink();
		
		value="Date";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Date and Time
		issue.clickdateandtimelink();
		
		value="Date and Time";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Picture
		issue.clickpiclink();
		
		value="Picture";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.selectimagesdropdown();
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Number
		issue.clicknumlink();
		
		value="Number";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Radio button
		issue.clickradiolink();
		
		value="Radio";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.enterfieldvalue1textbox();
		
		//Thread.sleep(3000);
		issue.clickplusbtn();
		
		//Thread.sleep(3000);
		issue.enterfieldvalue2textbox();
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Drop down
		issue.clickdropdownlink();
		
		value="Drop Down";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.enterfieldvalue1textbox();
		
		//Thread.sleep(3000);
		issue.clickplusbtn();
		
		//Thread.sleep(3000);
		issue.enterfieldvalue2textbox();
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Signature
		issue.clicksignlink();
		
		value="Signature";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		Thread.sleep(3000);
		issue.clickaddfieldcstmbtn();
		
		//Thread.sleep(3000);
		//Click on Text
		issue.clicktextlink();
		
		value="Text";
		//Thread.sleep(3000);
		issue.enterfieldlabeltextbox(value);
		
		//Thread.sleep(3000);
		issue.clickaddfieldbtn();
		
		//Thread.sleep(3000);
		issue.clicksavebtn();		
		
		Thread.sleep(3000);
		
		
	}
	
	
	

	
}
