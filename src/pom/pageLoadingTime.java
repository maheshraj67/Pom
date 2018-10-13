package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Basepage;

public class pageLoadingTime extends Basepage{

	public pageLoadingTime(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="html/body/section/div/div/div[1]/table/tbody/tr[3]/td[1]")
	private WebElement ele;
	
	public void clickEle()
	{
		ele.click();
	}
	
	public void superclientloading()
	{
		System.out.println("Loading Super Client page");
		loading(ele);
	}
	
	@FindBy(xpath="//a[@class='viewSiteDashboard-btn']")
	private WebElement sitedashboardlink;
	
	public void clicksitedashboardlink()
	{
		sitedashboardlink.click();	
	}
	
	@FindBy(xpath="//div[@id='deptInfo']/table/tbody/tr[1]/td[1]")
	private WebElement dashboardele;
	
	public void dashboardeleLoading()
	{
		System.out.println("Loading dashboard");
		loading(dashboardele);
	}

	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/a/span")
	private WebElement checklistBtn;
	
	public void clickChecklistBtn()
	{
		checklistBtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[3]/a/span")
	private WebElement patrolReportBtn;
	
	public void clickPatrolReportBtn()
	{
		patrolReportBtn.click();
	}
	
	@FindBy(xpath="//div/div[1]/div[2]/div[2]/div[1]/div[1]/b")
	private WebElement patrolReportEle;
	
	public void patrolReportEleLoading()
	{
		System.out.println("Loading beat patrol page");
		loading(patrolReportEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[4]/a/span")
	private WebElement issuesBtn;
	
	public void clickIssuesBtn()
	{
		issuesBtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[4]/ul/li[1]/a/span")
	private WebElement viewIssueBtn;
	
	public void clickViewIssueBtn()
	{
		viewIssueBtn.click();
	}
	
	@FindBy(xpath="//table[@id='issueTable']/thead/tr/th[1]")
	private WebElement issuesEle;
	
	public void issuesEleLoading()
	{
		System.out.println("Loading Issues page");
		loading(issuesEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[5]/a/span")
	private WebElement workshiftBtn;
	
	public void clickWorkshiftBtn()
	{
		workshiftBtn.click();
	}
	
	@FindBy(xpath="//div[@id='shiftLogsContainer']/div[5]/div[1]/div[2]")
	private WebElement workshiftEle;
	
	public void workshiftEleLoading()
	{
		System.out.println("Loading Workshift page");
		loading(workshiftEle);
	}

	@FindBy(xpath="//span[.='Settings']")
	private WebElement settingsBtn;
	
	public void clickSettingsBtn()
	{
		settingsBtn.click();
	}
	
	@FindBy(xpath="//span[.='Manage Locations']")
	private WebElement manageLocationsBtn;
	
	public void clickManageLocationsBtn()
	{
		manageLocationsBtn.click();
	}
	
	@FindBy(xpath="//table[@id='enableLoclist']/thead/tr/th[1]")
	private WebElement manageLocationsEle;
	
	public void manageLocationsEleLoading()
	{
		System.out.println("Loading Manage Locations page");
		loading(manageLocationsEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[3]/a/span")
	private WebElement manageChecklistBtn;
	
	public void clickManageChecklistBtn()
	{
		manageChecklistBtn.click();
	}
	
	@FindBy(xpath="//div[@id='reportsList']/div[1]/span")
	private WebElement manageChecklistEle;
	
	public void manageChecklistEleLoading()
	{
		System.out.println("Loading Manage checklist page");
		loading(manageChecklistEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[5]/a/span")
	private WebElement manageWorkshiftBtn;
	
	public void clickManageWorkShiftBtn()
	{
		manageWorkshiftBtn.click();
	}
	
	@FindBy(xpath="//table[@id='usersList']/tbody/tr[1]/td[2]")
	private WebElement manageWorkshiftEle;
	
	public void manageWorkshiftEleLoading()
	{
		System.out.println("Loading Manage Workshift page");
		loading(manageWorkshiftEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[7]/a/span")
	private WebElement manageUsersBtn;
	
	public void clickManageUsersBtn()
	{
		manageUsersBtn.click();
	}
	
	@FindBy(xpath="//div[@id='usersDiv']/div[2]/div[2]")
	private WebElement manageUsersEle;
	
	public void manageUsersEleLoading()
	{
		System.out.println("Loading Manage users page");
		loading(manageUsersEle);
	}
	
	@FindBy(xpath="//ul[@id='myTab']/li[1]/a")
	private WebElement departmentTab;
	
	public void clickDepartmentTab()
	{
		departmentTab.click();
	}
	
	@FindBy(xpath="//div[@id='deptsDiv']/div[2]/div[2]/div[1]")
	private WebElement departmentEle;
	
	public void departmentEleLoading()
	{
		System.out.println("Loading Manage Department Tab");
		loading(departmentEle);
	}
	
	public void clickDepartmentEle()
	{
		departmentEle.click();
	}
	
	@FindBy(xpath="//div[@id='deptsDiv']/div[2]/div[2]/ul/li/a")
	private WebElement viewDeptBtn;
	
	public void clickViewDeptBtn()
	{
		viewDeptBtn.click();
	}
	
	@FindBy(xpath="//form[@id='deptSettForm']/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/input")
	private WebElement viewDeptEle;
	
	public void viewDeptEleLoading()
	{
		System.out.println("Loading View/Edit Department Page");
		loading(viewDeptEle);
	}
	
	@FindBy(xpath="//ul[@id='myTab']/li[2]/a")
	private WebElement usersTab;
	
	public void clickUsersTab()
	{
		usersTab.click();
	}
	
	public void usersEleLoading()
	{
		System.out.println("Loading Manage Users Tab ");
		loading(manageUsersEle);
	}
	
	public void clickUsersEleBtn()
	{
		manageUsersEle.click();
	}
	
	@FindBy(xpath="//div[@id='usersDiv']/div[2]/div[2]/ul/li/a")
	private WebElement viewUserBtn;
	
	public void clickViewUserBtn()
	{
		viewUserBtn.click();
	}
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div[1]/div[2]/label")
	private WebElement viewUsersEle;
	
	public void viewUsersEleLoading()
	{
		System.out.println("Loading View/Edit Users Page");
		loading(viewUsersEle);
	}
	
	@FindBy(id="submitButtonId")
	private WebElement userUpdateBtn;
	
	public void clickUserUpdateBtn()
	{
		userUpdateBtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[9]/a/span")
	private WebElement manageLocScheduleBtn;
	
	public void clickManageLocScheduleBtn()
	{
		manageLocScheduleBtn.click();
	}
	
	@FindBy(xpath="//table[@id='SchedulesList']/thead/tr/th[1]")
	private WebElement locScheduleEle;
	
	public void locScheduleEleLoading()
	{
		System.out.println("Loading Location Schedule page");
		loading(locScheduleEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[11]/a/span")
	private WebElement manageEmailBtn;
	
	public void clickManageEmailBtn()
	{
		manageEmailBtn.click();
	}
	
	@FindBy(xpath="//div[@id='siteStatus']/div/h4")
	private WebElement manageEmailEle;
	
	public void manageEmailEleLoading()
	{
		System.out.println("Loading Manage Email page");
		loading(manageEmailEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[13]/a")
	private WebElement editProfileBtn;
	
	public void clickeditProfileBtn()
	{
		editProfileBtn.click();
	}
	
	@FindBy(xpath="//form[@id='editprofileForm']/div[2]/div[2]/label")
	private WebElement editProfileEle;
	
	public void editProfileEleLoading()
	{
		System.out.println("Loading Edit Profile page");
		loading(editProfileEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[6]/a/span")
	private WebElement changeSiteBtn;
	
	
	public void clickChangeSiteBtn()
	{
		changeSiteBtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[6]/ul/li[1]/a/span")
	private WebElement allSitesBtn;
	
	public void clickAllSitesBtn()
	{
		allSitesBtn.click();
	}
	
	@FindBy(xpath="//div/div/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement clientDashboardEle;
	
	public void clientDashboardEleLoading()
	{
		System.out.println("Loading Client dashboard page");
		loading(clientDashboardEle);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/a/span")
	private WebElement manageBtn;
	
	public void clickManageBtn()
	{
		manageBtn.click();
	}
	
	@FindBy(xpath="//section[1]/div/div/div[2]/button")
	private WebElement manageDropDown;
	
	public void clickManageDropDown()
	{
		manageDropDown.click();
	}
	
	@FindBy(xpath="//li[@id='#manageChecklist']/a")
	private WebElement clientManageChecklistBtn;
	
	public void clickclientManageChecklistBtn()
	{
		clientManageChecklistBtn.click();
	}
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr[1]/td[1]")
	private WebElement clientManageChecklistEle;
	
	public void clientManageChecklistEleLoading()
	{
		System.out.println("Loading Manage checklist, client level");
		loading(clientManageChecklistEle);
	}
	
	@FindBy(xpath="//li[@id='#manageDepartment']/a")
	private WebElement clientManageDepartmentBtn;
	
	public void clickClientManageDepartmentBtn()
	{
		clientManageDepartmentBtn.click();
	}
	
	@FindBy(xpath="//section[@id='selectDeptForm']/div[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement clientManageDptEle;
	
	public void clientManageDptEleLoading()
	{
		System.out.println("Loading Manage Department, client level");
		loading(clientManageDptEle);
	}
	
	@FindBy(xpath="//li[@id='#manageUsers']/a")
	private WebElement clientUserBtn;
	
	public void clickClientUserBtn()
	{
		clientUserBtn.click();
	}
	
	@FindBy(xpath="//section[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/h4")
	private WebElement clientUserEle;
	
	public void clientUserEleLoading()
	{
		System.out.println("Loading Manage Users,client level");
		loading(clientUserEle);
	}
	
	@FindBy(xpath="//div[@id='gallery']/div[3]")
	private WebElement imageGalleryBtn;
	
	public void clickImageGalleryBtn()
	{
		imageGalleryBtn.click();
	}
	
	@FindBy(xpath="//select[@id='filterReportType']")
	private WebElement imageGalleryEle;
	
	public void imageGalleryEleLoading()
	{
		System.out.println("Loading Image Gallery");
		loading(imageGalleryEle);
	}
	
}
