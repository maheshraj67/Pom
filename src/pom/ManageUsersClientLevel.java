package pom;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class ManageUsersClientLevel extends Basepage{

	public ManageUsersClientLevel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//section[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/h4")
	private WebElement siteLink;
	
	public void clickSite()
	{
		siteLink.click();
	}
	
	@FindBy(xpath="//div[@id='bulkUserUploadOpt']/button")
	private WebElement bulkUserUploadBtn;
	
	public void clickBulkUserUploadBtn()
	{
		bulkUserUploadBtn.click();
	}
	
	@FindBy(id="userListFile")
	private WebElement browseBtn;
	
	public void clickBrowseBtn()
	{
		browseBtn.sendKeys("C:\\Users\\bhuva\\workspace\\PazoAutomation\\Excel\\BulkUser.csv");
	}
	
	@FindBy(xpath="//form[@id='addUserBulkForm']/div/div/div/div[3]/div/div[2]/button")
	private WebElement uploadBtn;
	
	public void clickUploadBtn()
	{
		uploadBtn.click();
	}
	
	@FindBy(id="userAutocpText")
	private WebElement autosearchTxtBox;
	
	public void clickAutoSearchTxtBox()
	{
		autosearchTxtBox.sendKeys("a");
	}
	
	@FindBy(xpath="//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content custom-ui-class']/li[1]")
	private WebElement autoSearchUser;
	
	public void clickAutoSearchUser()
	{
		autoSearchUser.click();
	}
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[4]/button[1]")
	private WebElement editUserBtn;
	
	public void clickEditUserBtn()
	{
		editUserBtn.click();
	}
	
	@FindBy(xpath="//form[@id='editUserForm']/div[1]/div[1]/div/input")
	private WebElement frstNameTxtField;
	
	public void enterFstNameTxtField()
	{
		frstNameTxtField.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		frstNameTxtField.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editUserForm']/div[1]/div[3]/div/input")
	private WebElement usernameTxtField;
	
	public void enterUsernameTxtField()
	{
		usernameTxtField.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		
		usernameTxtField.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editUserForm']/div[1]/div[5]/div/input")
	private WebElement pwdTxtField;
	
	public void enterPwdTxtField()
	{
		pwdTxtField.clear();
		pwdTxtField.sendKeys("12345");
	}
	
	@FindBy(id="changePwd")
	private WebElement confmPwdTxtField;
	
	public void enterConfmPwdTxtField()
	{
		confmPwdTxtField.clear();
		confmPwdTxtField.sendKeys("12345");
	}
	
	@FindBy(xpath="//form[@id='editUserForm']/div[1]/div[7]/div/div/button")
	private WebElement pinField;
	
	public void clickPinField()
	{
		
		pinField.click();
	}
	
	
	@FindBy(xpath="//form[@id='editUserForm']/div[1]/div[8]/div[3]/div/input")
	private WebElement phTxtField;
	
	public void enterPhTxtField()
	{
		phTxtField.clear();
		//String ph = RandomStringUtils.random();
		Random rand = new Random();

		// CharSequence[] drand = (CharSequence[])(rand.nextDouble()*10000000000L);
		
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		//String mob = Long.toString(number);
		phTxtField.sendKeys(number+"");
	}
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td/div[@class='checkbox']")
	private WebElement siteCheckBox;
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[2]/div/div/button")
	private WebElement userTypeDropDown;
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[2]/div[1]/div[1]/ul[1]/li")
	private List<WebElement> userTypeValue;
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[3]/div/div/button")
	private WebElement deptDropDown;
	
	@FindBy(xpath="//table[@id='userListSite']/tbody/tr[1]/td[3]/div/div/ul/li")
	private List<WebElement> deptDropDownValue;

	
	public void selectSiteCheckBox()
	{
		if(siteCheckBox.isSelected() || !siteCheckBox.isSelected())
		{
			siteCheckBox.click();
		}
		if(siteCheckBox.isSelected())
		{
			userTypeDropDown.click();
			for(WebElement u:userTypeValue)
			{
				if(!u.isSelected() || u.isSelected())
				{
					u.click();
				}
			}
			deptDropDown.click();
			for(WebElement e:deptDropDownValue)
			{
				if(!e.isSelected() || e.isSelected())
				{
					e.click();
				}
			}
		}
		
		
	}
	
	
	@FindBy(xpath="//form[@id='editUserForm']/div[4]/div/div[3]/button")
	private WebElement submitBtn;
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	
	
	
}
