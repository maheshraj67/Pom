package pom;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import generic.Basepage;

public class ManageUserPage extends Basepage{

	public ManageUserPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[1]/div[1]/div/input")
	private WebElement firstnameTxtBox;
	
	String fname;
	public void enterFirstNametextbox()
	{
		String fname = RandomStringUtils.randomAlphabetic(8);
		firstnameTxtBox.sendKeys(fname);
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[1]/div[3]/div/input")
	private WebElement usernameTxtBox;
	
	public void enterusernameTxtBox()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		usernameTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[1]/div[4]/div/input")
	private WebElement emailaddressTxtBox;
	
	public void enterEmailaddressTxtBox()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		emailaddressTxtBox.sendKeys(s+"@gmail.com");
	}

	@FindBy(xpath="//form[@id='addUserForm']/div[1]/div[7]/div/div/button")
	private WebElement pinGeneratorBtn;
	
	public void clickPinGeneratorBtn()
	{
		pinGeneratorBtn.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[3]/div/table/tbody/tr[1]/td[1]/div/label/i")
	private WebElement siteCheckBox;
	
	public void selectSiteCheckBox()
	{
		siteCheckBox.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[3]/div/table/tbody/tr[1]/td[1]/div/label/input")
	private WebElement siteattrval;
	
	String site;
	
	public void storeSiteAttrval()
	{
		site=siteattrval.getAttribute("value");
		System.out.println(site);
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[3]/div/table/tbody/tr[1]/td[2]/div/div/button")
	private WebElement usertypeBtn;
	
	public void clickUserTypeBtn()
	{
		usertypeBtn.click();
	}
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]/div[1]/div[1]/ul/li[2]/div[1]/div[1]/label[1]")
	private WebElement fieldUserType;
	
	public void clickFieldUserType()
	{
		fieldUserType.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[3]/div/table/tbody/tr[1]/td[3]/div/div/button")
	private WebElement deptDropDownBtn;
	
	public void clickDeptDropDownBtn()
	{
		deptDropDownBtn.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[3]/div/table/tbody/tr[1]/td[3]/div/div/ul/div/a[1]")
	private WebElement selectAllBtn;
	
	public void clickSelectAllBtn()
	{
		selectAllBtn.click();
	}
	
	@FindBy(xpath="//form[@id='addUserForm']/div[4]/div/div[3]/button")
	private WebElement submitBtn;
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	
	@FindBy(tagName="body")
	private WebElement body;
	
	public void clickBody()
	{
		body.click();
	}
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[1]")
	private List<WebElement> userPresent;
	
	public void verifyuserpresent()
	{

		for(WebElement e:userPresent)
		{
			
			if(e.getText().equals(fname))
			{
				//clickissueId();
				e.click();
				System.out.println("\n");
				Reporter.log("User is present",true);
				break;
			}
		}
	}
	
	@FindBy(xpath="html/body/section[2]/div[2]/div[1]/div[1]/div[2]/div[1]")
	private List<WebElement> siteList;
	
	public void verifySite()
	{
		for(WebElement e:siteList)
		{
			
			if(e.getAttribute("data-site").equals(site))
			{
				e.click();
				System.out.println("\n");
				Reporter.log("Site is present",true);
				break;
			}
		}
	}
	
	public void refresh()
	{
		//driver.navigate().to(driver.getCurrentUrl());
		driver.navigate().refresh();
	}
	

	@FindBy(xpath="//div[@id='usersDiv']/div[2]/div[2]/div[1]")
	private WebElement user;
	
	public void clickUser()
	{
		user.click();
	}
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div[1]/div[3]/div[1]/div[1]/div/input")
	private WebElement frstNameEditTxtBox;
	
	public void enterFrstNmeEdtTXtBox()
	{
		frstNameEditTxtBox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		frstNameEditTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div[1]/div[3]/div[2]/div[2]/div/input")
	private WebElement usrnmeEditTxtBox;
	
	public void enterusrnmeEditTxtBox()
	{
		usrnmeEditTxtBox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		usrnmeEditTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div[1]/div[3]/div[3]/div[2]/div/div/div[2]/input")
	private WebElement phTxtEditField;
	
	public void enterPhTxtEditField()
	{
		phTxtEditField.clear();
		//String ph = RandomStringUtils.random();
		Random rand = new Random();

		// CharSequence[] drand = (CharSequence[])(rand.nextDouble()*10000000000L);
		
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		//String mob = Long.toString(number);
		phTxtEditField.sendKeys(number+"");
	}
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div[1]/div[3]/div[3]/div[1]/div/div/div/button")
	private WebElement pinEditTxtBox;
	
	public void clickPinEditTxtBox()
	{
		pinEditTxtBox.click();
	}
	
	@FindBy(id="passwordInp")
	private WebElement pwdEditTxtBox;
	
	public void enterPwdEditTxtBox()
	{
		pwdEditTxtBox.sendKeys("12345");
	}
	
	@FindBy(id="changePwd")
	private WebElement confirmEditPwdTxtBox;
	
	public void enterConfirmEditPwdTxtBox()
	{
		confirmEditPwdTxtBox.sendKeys("12345");
	}
	
	@FindBy(id="submitButtonId")
	private WebElement updateUserProfileBtn;
	
	public void clickUpdateUserProfileBtn()
	{
		updateUserProfileBtn.click();
	}
	
	@FindBy(id="isdEdit")
	private WebElement countrycodeDrpDown;
	
	public void selectCountryCodeEdit()
	{
		Select sel=new Select(countrycodeDrpDown);
		sel.selectByIndex(1);;
	}
	
	
	@FindBy(xpath="//form[@id='userEditForm']/div/div/div[2]/div/div/label")
	private WebElement usertypeEditField;
	
	public void clickUserTypeEditField()
	{
		usertypeEditField.click();
	}
}
