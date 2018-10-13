package pom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.Basepage;

public class ManageLocationsPage extends Basepage{

	public ManageLocationsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[.='Add Location']")
	private WebElement addlocationbtn;

	//Click on Add location
	public void clickaddlocationbtn()
	{
		addlocationbtn.click();
	}
	
	@FindBy(id="showDisableList")
	private WebElement showdisablebtn;
	
	@FindBy(id="showEnableList")
	private WebElement showenablebtn;
	
	@FindBy(xpath="//button[@data-target='#addLocBulkForm']")
	private WebElement bulklocuploadbtn;

	//Click on bulk location
	public void clickBulkLocation()
	{
		bulklocuploadbtn.click();
	}
	
	@FindBy(id="locListFile")
	private WebElement uploadbulkloc;
	
	//Upload bulk location file
	public void uploadBulkLoc()
	{
		uploadbulkloc.sendKeys("C:\\Users\\bhuva\\workspace\\PazoAutomation\\Excel\\BulkLocation.csv");
	}
	
	@FindBy(xpath="(//button[@class='btn btn-default btn-tool'])[1]")
	private WebElement editlocationbtn;
	
	//Click on edit location
	public void clickeditlocation()
	{
		editlocationbtn.click();
	}
	
	@FindBy(xpath="//table[@id='enableLoclist']/tbody/tr[1]/td[10]/button")
	private WebElement disablebtn;
	
	//Click on disbable
	public void clickDisablebtn()
	{
		disablebtn.click();
	}
	
	@FindBy(xpath="//table[@id='disableLoclist']/tbody/tr/td[9]/button")
	private WebElement enablebtn;
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[1]/div/input")
	private WebElement loccodetbox;
	
	//Enter the location code
	public void enterloccodevalue()
	{
		//loccodetbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		loccodetbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[2]/div/input")
	private WebElement locnametbox;
	
	//Enter location name
	public void enterlocnamevalue()
	{
		//locnametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		locnametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[4]/div/input")
	private WebElement addtbox;
	
	//Enter address
	public void enteraddressvalue()
	{
		//addtbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		addtbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[5]/div/input")
	private WebElement areatbox;
	
	//Enter area
	public void enterareavalue()
	{
		//areatbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		areatbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[6]/div/input")
	private WebElement citytbox;
	
	//Enter city
	public void entercityvalue()
	{
		//citytbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		citytbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[7]/div/input")
	private WebElement unitnametbox;
	
	//Enter unit
	public void enterunitnamevalue()
	{
		//unitnametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		unitnametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocForm']/div/div/div[2]/div/div[1]/div[8]/div/input")
	private WebElement inchargenametbox;
	
	//Enter incharge name
	public void enterinchargevalue()
	{
		//inchargenametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		inchargenametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//button[.='Create']")
	private WebElement createbtn;
	
	//Click on create button
	public void clickacreatebtn()
	{
		createbtn.click();
		Reporter.log("Location added successfully",true);
	}
	
	@FindBy(xpath="//button[.='Save']")
	private WebElement savebtn;
	
	//Click on save button
	public void clicksavebtn()
	{
		savebtn.click();
		Reporter.log("Location edited successfully",true);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[1]/div/input")
	private WebElement editloccodetbox;
	
	//Enter edit location code
	public void entereditloccodevalue()
	{
		editloccodetbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editloccodetbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[2]/div/input")
	private WebElement editlocnametbox;
	
	//Enter edit location name
	public void entereditlocnamevalue()
	{
		editlocnametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editlocnametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[4]/div/input")
	private WebElement editaddtbox;
	
	//Enter edit address 
	public void entereditaddressvalue()
	{
		editaddtbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editaddtbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[5]/div/input")
	private WebElement editareatbox;
	
	//Enter edit area
	public void entereditareavalue()
	{
		editareatbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editareatbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[6]/div/input")
	private WebElement editcitytbox;
	
	//Enter edit city
	public void entereditcityvalue()
	{
		editcitytbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editcitytbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[7]/div/input")
	private WebElement editunitnametbox;
	
	//Enter edit unit name
	public void entereditunitnamevalue()
	{
		editunitnametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editunitnametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='editLocForm']/div/div/div[2]/div/div[1]/div[8]/div/input")
	private WebElement editinchargenametbox;
	
	//Enter edit incharge
	public void entereditinchargevalue()
	{
		editinchargenametbox.clear();
		String s = RandomStringUtils.randomAlphabetic(8);
		editinchargenametbox.sendKeys(s);
	}
	
	@FindBy(xpath="//form[@id='addLocBulkForm']/div/div/div[3]/button[2]")
	private WebElement uploadBtn;
	
	//Click on the upload button
	public void clickUploadBtn()
	{
		uploadBtn.click();
		Reporter.log("Bulk location added successfully",true);
	}
	
	@FindBy(id="disableBut")
	private WebElement diableBtn;
	
	public void clickDisableBtn()
	{
		diableBtn.click();
		Reporter.log("Location disabled successfully",true);
	}
}
