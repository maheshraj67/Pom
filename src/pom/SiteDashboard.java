package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class SiteDashboard extends Basepage{

	public SiteDashboard(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//span[.='Settings']")
	private  WebElement settingsbtn;
	
	@FindBy(xpath="//span[.='Manage Locations']")
	private WebElement managelocationsbtn;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[3]/a/span")
	private WebElement managechecklistbtn;
	
	@FindBy(xpath="//span[.='Manage Issues']")
	private WebElement manageissuesbtn;
	
	@FindBy(xpath="//span[.='Manage Work Shifts']")
	private WebElement manageworkshiftbtn;
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]/ul/li[9]/a/span")
	private WebElement locationschedulebtn;
	
	@FindBy(xpath="//span[.='Manage Users']")
	private WebElement managedeptbtn;
	
	@FindBy(xpath="//span[.='Manage Emails']")
	private WebElement manageemailsbtn;
	
	@FindBy(xpath="//span[.='Edit Profile']")
	private WebElement editprofilebtn;
	
	
	public void clicksettingstbtn()
	{
		settingsbtn.click();
	}
	
	public void verifysettingsbtn()
	{
		verifyElementpresent(settingsbtn);
	}
	public void clickmanagelocationsbtn()
	{
		managelocationsbtn.click();
	}
	public void clickmanagechecklistbtn()
	{
		managechecklistbtn.click();
	}
	public void clickmanageissuesbtn()
	{
		manageissuesbtn.click();
	}
	public void clickmanageworkshiftbtn()
	{
		manageworkshiftbtn.click();
	}
	public void clicklocationschedulebtn()
	{
		locationschedulebtn.click();
	}
	public void clickmanagedeptbtn()
	{
		managedeptbtn.click();
	}
	public void clickmanageemailsbtn()
	{
		manageemailsbtn.click();
	}
	
	public void clickeditprofilebtn()
	{
		editprofilebtn.click();
	}
	
	@FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']/ul[1]/li[4]/a/span")
	private WebElement Issues;
	
	public void clickIssues()
	{
		Issues.click();
	}
	
}
