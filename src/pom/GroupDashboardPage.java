package pom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class GroupDashboardPage extends Basepage {

	public GroupDashboardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	//@FindBy(xpath="//tr[3]/td[1]")
	@FindBy(xpath="//div[1]/table/tbody/tr[3]/td[1]")
	private WebElement clientnamelink;
	
	@FindBy(xpath="//div[@id='siteDepartmentDiv']/div/div[2]/a")
	private WebElement sitedashboardlink;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/a/span")
	private WebElement manageMenuButton;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/ul/li[3]/a/span")
	private WebElement manageDepartments;
	
	@FindBy(xpath="//section[1]/div/div/div/button")
	private WebElement addButton;
	
	@FindBy(xpath="//section[1]/div/div/div/ul/li[3]/a")
	private WebElement department;
	
	@FindBy(xpath="//form[@id='addDepartmentForm' and @style='display: block;']/div/div/div/div[2]/div/div/div/div/input")
	private WebElement departmentText;
	
	@FindBy(xpath="//form[@id='addDepartmentForm' and @style='display: block;']/div/div/div/div[3]/div/div[2]/button")
	private WebElement submitBtn;
	
	@FindBy(xpath="//section[@id='selectDeptForm']/div[2]/div/div/table/tbody/tr[1]/td[2]/button")
	private WebElement editDepartment;
	
	@FindBy(id="deptName")
	private WebElement editDeptText;
	
	@FindBy(xpath="//form[@id='editDepartmentForm']/div/div/div/div[3]/div/div[2]/button")
	private WebElement editSubmitBtn;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/ul/li[9]/a/span")
	private WebElement manageUser;
	
	@FindBy(xpath="//section[1]/div/div/div/ul/li[2]/a")
	private WebElement userBtn;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/ul/li[5]/a/span")
	private WebElement manageIssuesBtn;
	
	@FindBy(xpath="//form[@id='addDepartmentForm']/div/div/div/div[2]/div/div/div/div/input")
	private WebElement deptName;
	
	public void clickclientnamelink()
	{
		clientnamelink.click();
	}
	
	public void clickSiteDashboardLink()
	{
		sitedashboardlink.click();
	}
	public void verifyGroupDashboard(String gp)
	{
		verifytitle(gp);
	}
	public void clickManageMenuButton()
	{
		manageMenuButton.click();
	}
	public void clickManageDepartments()
	{
		manageDepartments.click();
	}
	public void clickAddButton()
	{
		addButton.click();
	}
	public void clickDepartment()
	{
		department.click();
	}
	public void enterDepartmentText()
	{
		departmentText.sendKeys("Department 1");
	}
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	public void clickeditDepartment()
	{
		editDepartment.click();
	}
	public void entereditDeptText()
	{
		editDeptText.clear();
		editDeptText.sendKeys("Department2");
	}
	public void clickeditSubmitBtn()
	{
		editSubmitBtn.click();
	}
	public void clickManageUserbtn()
	{
		manageUser.click();
	}
	public void clickUserBtn()
	{
		userBtn.click();
	}
	
	public void clickManageIssuesBtn()
	{
		manageIssuesBtn.click();
	}
	
	public void enteDeptName()
	{
		String s = RandomStringUtils.randomAlphabetic(8); 
		deptName.sendKeys(s);
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[2]/ul/li[7]/a/span")
	private WebElement manageSiteBtn;
	
	public void clickManageSiteBtn()
	{
		manageSiteBtn.click();
	}
	
	@FindBy(xpath="//section[1]/div/div/div/ul/li[1]/a")
	private WebElement siteBtn;
	
	public void clickSiteBtn()
	{
		siteBtn.click();
	}
	
	
}
