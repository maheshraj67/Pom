package pom;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
//import org.omg.CORBA_2_3.portable.InputStream;
import java.io.InputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import generic.Basepage;

public class IssuesPage extends Basepage {
	
	
	//Constructor
	public IssuesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}

	//Filter options
	@FindBy(xpath="//button[.='Filter Options']")
	private WebElement filter;
	
	//Click on Filter options
	public void clickfilter()
	{
		filter.click();
	}
	
	//From Date
	@FindBy(id="fromDate")
	private WebElement fromDate;
	
	//Click on From Date
	public void clickfromDate()
	{
		fromDate.click();
	}
	
	// MonthDate Picker
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/div/select[1]")
	private WebElement monDatePicker;
	
	//Select on Month Date Picker
	public void selectmonDatePicker()
	{
		Select sel=new Select(monDatePicker);
		sel.selectByValue("0");
	}
	
	//YearDate Picker
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/div/select[2]")
	private WebElement yearDatePicker;
	
	//Select Year Date Picker
	public void selectyearDatePicker()
	{
		Select sel=new Select(yearDatePicker);
		sel.selectByValue("2007");
	}
	
	//Date
	@FindBy(xpath=" //div[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")
	private WebElement date;
	
	//Click Date
	public void clickdate()
	{
		date.click();
	}
	
	//Apply Change
	@FindBy(id="applyChange")
	private WebElement applychange;
	
	//Click on Apply Change
	public void clickapplychange()
	{
		applychange.click();
		System.out.println("\n");
		Reporter.log("Filter is appplied successfully",true);
	}
	
	//Change Status
	@FindBy(xpath="//table[@id='issueTable']/tbody/tr[1]/td[7]/div/button")
	private WebElement changestatus;
	
	//Click on Change Status
	public void clickchangestatus()
	{
		changestatus.click();
	}
	
	//Duplicate status
	@FindBy(xpath="//a[.='Mark as Duplicate']")
	private WebElement statusDuplicate;
	
	//Click on status duplicate
	public void clickstatusduplicate()
	{
		statusDuplicate.click();
	}
	
	//InComplete
	@FindBy(xpath="//a[.='Mark as Incomplete']")
	private WebElement statusInComplete;
	
	//Click on status Incomplete
	public void clickstatusIncomplete()
	{
		statusInComplete.click();
	}
	
	//Complete
	@FindBy(xpath="//a[.='Mark as Completed']")
	private WebElement statusComplete;
	
	//Click on status Complete
	public void clickstatuscomplete()
	{
		statusComplete.click();
	}
	
	//Deferred
	@FindBy(xpath="//a[.='Mark as Deferred']")
	private WebElement statusDeffered;
	
	//Click on status deferred
	public void clickstatusDeferred()
	{
		statusDeffered.click();
	}
	
	//Close
	@FindBy(xpath="//a[.='Close Issue']")
	private WebElement statusclose;
	
	//Click on status close
	public void clickstatusclose()
	{
		statusclose.click();
	}
	
	//New
	@FindBy(xpath="//a[.='Mark as New']")
	private WebElement statusnew;
	
	//Click on status new
	public void clickstatusnew()
	{
		statusnew.click();
	}
		
	//Reopen
	@FindBy(xpath="//a[.='Reopen Issue']")
	private WebElement statusreopen;
	
	public void clickstatusreopen()
	{
		statusreopen.click();
	}
	String dyn;
	LocalDate today=LocalDate.now();
	
	String issName = RandomStringUtils.randomAlphabetic(8);
	
	
	
	//Issues api0
	public void issues_api()
	{
		try {

			//DefaultHttpClient httpClient = new DefaultHttpClient();
			  HttpClient httpClient = HttpClientBuilder.create().build();
			  HttpPost postRequest = new HttpPost("http://beta.app.trakd.in/api/v3/issues/add-issue");

			StringEntity input = new StringEntity("{\r\n   \r\n  "
					+ " \"apiKey\":\"$2a$10$K1pD6dtA5Ix.CGkwXsYdteeMajSwxkix/gHkgbBKKvG7lHIsxZSOe\","
					+ "\r\n   \"issueTypeId\":\"5852d3d13d6fe71cf7d8d6b5\","
					+ "\r\n   \"siteId\":\"571a2de6f7cb8bb337d7e1af\","
					+ "\r\n   \"locationCode\":\"571a7152fdedb4473b93b2cc\","
					+ "\r\n   \"departmentId\":\"57c51b72e57791ee3c4cc7d9\","
					+ "\r\n   \"customValues\":[\r\n   "
					+ "   {\r\n         \"_id\":\"issueName\","
					+ "\r\n         \"label\":\"Issue Name\","
					+ "\r\n         \"type\":\"text\","
					+ "\r\n         \"value\":\""+ issName + "\"\r\n      },"
					+ "\r\n      {\r\n         \"_id\":\"issuePics\","
					+ "\r\n         \"label\":\"Add photos of the Issue\","
					+ "\r\n         \"type\":\"picture\","
					+ "\r\n         \"value\":\"\"\r\n      },"
					+ "\r\n      {\r\n         \"_id\":\"dueDate\","
					+ "\r\n         \"label\":\"Due Date\","
					+ "\r\n         \"type\":\"datetime\","
					+ "\r\n         \"value\":\"2017-12-30T17:44:00.000+0530\"\r\n      }\r\n   ],"
					+ "\r\n   \"time\":\""
					+ today + "T00:01:52.056+0530\","
					+ "\r\n   \"deviceTime\":\"" + today	+ "T00:01:52.661+0530\","
					+ "\r\n   \"incidentLat\":\"0.0\","
					+ "\r\n   \"incidentLong\":\"0.0\","
					+ "\r\n   \"lac\":\"34022\","
					+ "\r\n   \"cid\":\"26379884\","
					+ "\r\n   \"mcc\":\"404\","
					+ "\r\n   \"mnc\":\"45\","
					+ "\r\n   \"version\":\"4.5.0.2\","
					+ "\r\n   \"assignedTo\":\"57ac6f6d86c1f91e53178bf1\"\r\n}");
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);

			String result = EntityUtils.toString(response.getEntity());
			HttpEntity entity = response.getEntity(); 
		     InputStream instream = (InputStream) entity.getContent();

	        JSONObject j = new JSONObject(result);
	        dyn=j.getString("refId");
	        
	       System.out.println(" \n");
	        Reporter.log("The issues id generated is:" +dyn,true);
	        System.out.print(j+"");

			//httpClient.getConnectionManager().shutdown();
	        instream.close();
	        

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	
	//Issue Id
	@FindBy(xpath="//table[@id='issueTable']/tbody/tr[1]/td[1]/a")
	private WebElement issueId;
	
	//Click on the issue Id
	public void clickissueId()
	{
		issueId.click();
	}
	
	//Status
	@FindBy(xpath="//table[@id='issueTable']/tbody/tr[5]/td/div/button")
	private WebElement changeStatus;
	
	//Click on change status
	public void clickchangeStatus()
	{
		changeStatus.click();
		//verifystatus();
	}
	
	
	public void verifystatus()
	{
		String open="Open";
		String reopen="Reopen Issue";
		String complete="Completed";
		String duplicate="Duplicate";
		String closed="Closed";
		//System.out.println(changeStatus.getText());
		if(changeStatus.getText().equals(open) || changeStatus.getText().equals(reopen))
		{
			clickstatuscomplete();
		}else if(changeStatus.getText().equals(complete))
		{
			clickstatusclose();
		}else if(changeStatus.getText().equals(duplicate))
		{
			clickstatusclose();
		}else if(changeStatus.getText().equals(closed))
		{
			clickstatusreopen();
		}
		System.out.println("\n");
	
		Reporter.log("Status changed successfully",true);
	}
	
	//Row element
	@FindBy(xpath="//table[@id='issueTable']/tbody/tr/td[1]")
	private List<WebElement> issTable;	
	
	//Verify the issue ID
	public void verifyissueID()
	{	
		for(WebElement e:issTable)
		{
			//System.out.println(e.getText());
			if(e.getText().equals(dyn))
			{
				//clickissueId();
				e.click();
				System.out.println("\n");
				Reporter.log("The issue ID is verified",true);
				break;
			}
		}
	}

	//Share button
	@FindBy(id="shareBtn")
	private WebElement sharebtn;
	
	//Click on the share button
	public void clicksharebtn()
	{
		sharebtn.click();
	}
	
	@FindBy(xpath="//form[@id='shareIssueForm']/div/div/div[2]/div[2]/div/input")
	private WebElement emailId;
	
	public void enteremailId()
	{
		emailId.sendKeys("trakdapp11@gmail.com");
	}
	
	@FindBy(xpath="//form[@id='shareIssueForm']/div/div/div[3]/button[2]")
	private WebElement share;
	
	public void clickShare()
	{
		share.click();
		System.out.println("\n");
		Reporter.log("Issue is shared successfully",true);
	}
	
	@FindBy(id="textArr")
	private WebElement commentArea;
	
	public void entercomment()
	{
		commentArea.sendKeys("Hi from selenium");
	}
	
	@FindBy(xpath="//form[@id='revwForm']/div[4]/div/button")
	private WebElement sendbtn;
	
	public void clickSendBtn()
	{
		sendbtn.click();
		System.out.println("\n");
		Reporter.log("Commented on the issue",true);
	}
	
	@FindBy(name="revwImage")
	private WebElement camera;
	
	public void uploadImage()
	{
		//camera.click();
		camera.sendKeys("C:\\Users\\bhuva\\Desktop\\Bhuvana_testing\\Bugs\\b1.png");
	}

	@FindBy(xpath="//div[@id='filterDept']/div/div/label/i")
	private WebElement deptFilter;
	
	public void selectDeptFilter()
	{
		deptFilter.click();
	}
	
	@FindBy(xpath="//div[@id='filterUser']/div[1]/div/label/i")
	private WebElement userFilter1;
	
	@FindBy(xpath="//div[@id='filterUser']/div[2]/div/label/i")
	private WebElement userFilter2;
	
	public void selectUserFilter()
	{
		userFilter1.click();
		userFilter2.click();
	}
	
	@FindBy(xpath="//div[@id='filterStatus']/div[4]/div/label/i")
	private WebElement comStatus;
	
	@FindBy(xpath="//div[@id='filterStatus']/div[6]/div/label/i")
	private WebElement closeStatus;
	
	@FindBy(xpath="//div[@id='filterStatus']/div[3]/div/label/i")
	private WebElement dupStatus;
	
	public void selectStatus()
	{
		comStatus.click();
		closeStatus.click();
		dupStatus.click();
	}
	
	@FindBy(id="editAssign")
	private WebElement assignedTo;
	
	public void clickassignedTo()
	{
		assignedTo.click();
	}
	
	@FindBy(id="filterDept")
	private WebElement department;
	
	public void selectDepartment()
	{
		Select sel=new Select(department);
		sel.selectByIndex(1);
		department.click();
	}
	
	@FindBy(id="filterUser")
	private WebElement user;
	
	public void selectUser()
	{
		Select sel=new Select(user);
		sel.selectByIndex(1);
		user.click();
	}
	
	@FindBy(xpath="//form[@id='assignDepModal']/div/div/div[3]/button[2]")
	private WebElement assignBtn;
	
	public void clickAssignBtn()
	{
		assignBtn.click();
		System.out.println("\n");
		Reporter.log("Department and user reassigned successfully",true);
	}
	
	@FindBy(xpath="//table[@id='issueTable']/tbody/tr[7]/td/div/div[2]/button/i")
	private WebElement dueDate;
	
	public void clickDueDate()
	{
		dueDate.click();
	}
	
	@FindBy(id="due_date")
	private WebElement dueDateTxtBox;
	
	public void clickDuedateTxtBox()
	{
		dueDateTxtBox.click();
	}
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/div/select")
	private WebElement selectMonth;
	
	public void clickSelectMonth()
	{
		selectMonth.click();
		Select sel=new Select(selectMonth);
		sel.selectByVisibleText("Dec");
		//selectMonth.click();
	}
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")
	private WebElement Date;
	
	public void selectDate()
	{
		Date.click();
	}
	
	@FindBy(xpath="//form[@id='dueDateModal']/div/div/div[3]/button[2]")
	private WebElement changeBtn;
	
	public void clickChangeBtn()
	{
		changeBtn.click();
		System.out.println("\n");
		Reporter.log("Due date changed succesfully",true);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[4]/ul/li[1]/a/span")
	private WebElement viewIssueBtn;
	
	public void clickViewIssueBtn()
	{
		viewIssueBtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[4]/ul/li[3]/a/span")
	private WebElement raiseIssueBtn;
	
	public void clickRaiseIssueBtn()
	{
		raiseIssueBtn.click();
	}
	
	@FindBy(xpath="//form[@id='raiseIssueForm']/div[1]/div/div/input")
	private WebElement issueNameField;
	
	public void enterIssueName()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		issueNameField.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='raiseIssueForm']/div[2]/div/div/select")
	private WebElement issLocField;
	
	public void selectIssLocField()
	{
		issLocField.click();
		Select sel=new Select(issLocField);
		sel.selectByIndex(1);
	}
	
	@FindBy(xpath="//form[@id='raiseIssueForm']/div[3]/div/div/select")
	private WebElement issDeptField;
	
	public void selectIssDeptField()
	{
		issDeptField.click();
		Select sel=new Select(issDeptField);
		sel.selectByIndex(1);
	}
	
	@FindBy(xpath="//div[@id='dueDropDownSel']/select[1]")
	private WebElement issDueDateField;
	
	public void selectIssDueField()
	{
		issDueDateField.click();
		Select sel=new Select(issDueDateField);
		sel.selectByValue("10");
	}
	
	@FindBy(xpath="//form[@id='raiseIssueForm']/div[8]/div/div/div[3]/button")
	private WebElement submitBtn;
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	
	
}
