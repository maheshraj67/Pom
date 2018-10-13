package pom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.Basepage;

public class ManageDepartmentPage extends Basepage{

	public ManageDepartmentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[.='Add Department']")
	private WebElement addDepartmentBtn;
	
	public void clickAddDeptBtn()
	{
		addDepartmentBtn.click();
	}
	
	@FindBy(id="deptnm")
	private WebElement deptNameTxtBox;
	
	public void enterdeptNameTxtBox()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		deptNameTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addDepForm']/div[1]/div[1]/div[3]/button[2]")
	private WebElement submitBtn;
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
		Reporter.log("Department added successfully",true);
	}
	
	@FindBy(xpath="//button[.='Add User']")
	private WebElement addUserBtn;
	
	public void clickAddUserBtn()
	{
		addUserBtn.click();
	}

	@FindBy(xpath="//form[@id='addUserForm']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i")
	private WebElement adminUserTypeCheckbox;
	
	public void SelectAdminUserTypeCheckbox()
	{
		adminUserTypeCheckbox.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div/div/div[2]/div[2]/div[1]/div/input")
	private WebElement firstNameTxtBox;
	
	String s = RandomStringUtils.randomAlphabetic(8);
	public void enterFirstNameTxtBox()
	{
		firstNameTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div/div/div[2]/div[2]/div[3]/div/input")
	private WebElement emailaddressTxtBox;
	
	public void enteremailaddressTxtBox()
	{
		emailaddressTxtBox.sendKeys(s+"@gmail.com");
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div/div/div[4]/button[2]")
	private WebElement submitUserBtn;
	
	public void clickSubmitUserBtn()
	{
		submitUserBtn.click();
		Reporter.log("User added successfully",true);
	}
	
	@FindBy(xpath="//div[1]/div/div/div/div[1]/div/div/button[2]")
	private WebElement bulkUserUploadBtn;
	
	public void clickbulkUserUploadBtn()
	{
		bulkUserUploadBtn.click();
	}
	
	@FindBy(id="userListFile")
	private WebElement browseBtn;
	
	public void clickBrowserBtn()
	{
		browseBtn.sendKeys("C:\\Users\\bhuva\\workspace\\PazoAutomation\\Excel\\BulkUser.csv");
	}
	
	@FindBy(xpath="//form[@id='addUserBulkForm']/div/div/div[3]/button[2]")
	private WebElement uploadBtn;
	
	public void clickuploadBtn()
	{
		uploadBtn.click();
		Reporter.log("Bulk user added succesfully",true);
	}
	
	@FindBy(xpath="//div[@id='deptsDiv']/div[2]/div[2]/div[1]")
	private WebElement deptName;
	
	public void clickDeptName()
	{
		deptName.click();
	}
	
	
	@FindBy(xpath="//div[@id='deptsDiv']/div[2]/div[2]/ul/li[1]/a")
	private WebElement viewEditDeptBtn;
	
	public void clickviewEditDeptBtn()
	{
		viewEditDeptBtn.click();
	}
	
	@FindBy(id="userToselect")
	private WebElement quickTxtBox;
	
//	public void clickquickTxtBox()
//	{
//		quickTxtBox.sendKeys(");
//	}
//	
	@FindBy(id="passwordInp")
	private WebElement passwordField;
	
	public void enterpassword()
	{
		 passwordField.sendKeys("12345");
	}
	
	@FindBy(id="changePwd")
	private WebElement confirmpwdField;
	
	public void enterConfirmpwdField()
	{
		confirmpwdField.sendKeys("12345");
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div/div/div[2]/div[4]/div[1]/div/div/label/i")
	private WebElement deptcheckbox;
	
	public void selectDeptCheckbox()
	{
		deptcheckbox.click();
	}
	
	
	
}
