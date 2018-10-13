package pom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generic.Basepage;

public class ManageIssuesPage extends Basepage {

	

	public ManageIssuesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element;
	@FindBy(xpath="//div[@id='addFieldDropDown']/button")
	private WebElement addfieldcstmbtn;

	@FindBy(id="addFieldsForm")
	private WebElement fieldform;
	public void clickaddfieldcstmbtn()
	{
		//if(( fieldform).isDisplayed() )                                                                                                         
		//{         
		//	 wait.until(ExpectedConditions.invisibilityOfElementLocated((By) fieldform));    
		//}    
		
		element= wait.until(ExpectedConditions.elementToBeClickable(addfieldcstmbtn));
		element.click();
	}
	
	@FindBy(xpath="//a[.='Check Box']")
	private WebElement checkboxlink;

	public void clickcheckboxlink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(checkboxlink));
		element.click();
	}
	
	@FindBy(xpath="//div[@id='fieldLabel']/div[1]/input")
	private WebElement fieldlabeltextbox;
	
	public void enterfieldlabeltextbox(String value)
	{
		element= wait.until(ExpectedConditions.visibilityOf(fieldlabeltextbox));
		String s = RandomStringUtils.randomAlphabetic(8);
		element.sendKeys(value + " field label" + s);
	}
	
	@FindBy(xpath="//div[@id='valueCover']/div[1]/input")
	private WebElement fieldvalue1textbox;
	
	public void enterfieldvalue1textbox()
	{
		element= wait.until(ExpectedConditions.visibilityOf(fieldvalue1textbox));
		element.sendKeys("Yes");
	}
	
	@FindBy(xpath="//div[@id='valueCover']/div[2]/button")
	private WebElement plusbtn;
	
	public void clickplusbtn()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(plusbtn));
		element.click();
	}
	
	@FindBy(xpath="//div[@id='extraValues']/div/div[1]/input")
	private WebElement fieldvalue2textbox;
	
	public void enterfieldvalue2textbox()
	{
		element= wait.until(ExpectedConditions.visibilityOf(fieldvalue2textbox));
		element.sendKeys("No");
	}
	
	@FindBy(xpath="//form[@id='addFieldsForm']/div/div/div[3]/div[1]/button[2]")
	private WebElement addfieldbtn;
	
	public void clickaddfieldbtn()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(addfieldbtn));
		element.click();
	}
	
	@FindBy(xpath="//a[.='Date']")
	private WebElement datelink;
	
	public void clickdatelink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(datelink));
		element.click();
	}
	

	@FindBy(xpath="//a[.='Date and Time']")
	private WebElement dateandtimelink;

	public void clickdateandtimelink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(dateandtimelink));
		element.click();
	}

	@FindBy(xpath="//a[.='Picture']")
	private WebElement piclink;

	public void clickpiclink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(piclink));
		element.click();
	}
	
	
	@FindBy(id="takepic")
	private WebElement imagesdropdown;
	
	public void selectimagesdropdown()
	{
		
		Select sel=new Select(imagesdropdown);
		sel.selectByValue("3");
	}

	@FindBy(xpath="//a[.='Number']")
	private WebElement numlink;

	public void clicknumlink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(numlink));
		element.click();
	}

	@FindBy(xpath="//a[.='Radio']")
	private WebElement radiolink;

	public void clickradiolink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(radiolink));
		element.click();
	}

	@FindBy(xpath="//a[.='Drop Down']")
	private WebElement dropdownlink;

	public void clickdropdownlink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(dropdownlink));
		element.click();
	}

	@FindBy(xpath="//a[.='Signature']")
	private WebElement signlink;

	public void clicksignlink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(signlink));
		element.click();
	}

	@FindBy(xpath="//a[.='Text']")
	private WebElement textlink;
		
	public void clicktextlink()
	{
		element = wait.until(ExpectedConditions.elementToBeClickable(textlink));
		element.click();
	}
	
	@FindBy(xpath="//form[@id='issueSettForm']/div[5]/button[2]")
	private WebElement savebtn;
	
	public void clicksavebtn()
	{
		Reporter.log("something somethin",true);
		element = wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		element.click();
		
	}
	
	

	
	
}