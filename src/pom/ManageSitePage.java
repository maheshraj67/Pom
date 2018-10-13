package pom;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generic.Basepage;

public class ManageSitePage extends Basepage {

	public ManageSitePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//form[@id='addSiteForm']/div[1]/div[1]/div[1]/div/input")
	private WebElement siteNameTxtBox;
	
	public void enterSiteNameTxtBox()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		siteNameTxtBox.sendKeys("beta"+s);
	}
	
	@FindBy(id="pac-input")
	private WebElement searchMapTxtBox;
		
	public void enterSearchMapTxtBox()
	{
		String s = RandomStringUtils.randomAlphabetic(2);
		searchMapTxtBox.sendKeys(s);
	}
	
	@FindBy(xpath="//div[@class='pac-item'][1]")
	private WebElement autoSuggestionValue;
	
	public void chooseAutoSuggestionValue()
	{
		autoSuggestionValue.click();
	}
	
	@FindBy(xpath="//form[@id='addSiteForm']/div[1]/div[2]/div[3]/button")
	private WebElement applyBtn;
	
	public void clickApplyBtn()
	{
		applyBtn.click();
	}
	
	@FindBy(id="usertimezone")
	private WebElement timezoneDropDown;
	
	public void selectTimeZone()
	{
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		Select sel= new Select(timezoneDropDown);
		sel.selectByIndex(n);
	}
	
	@FindBy(xpath="//form[@id='addSiteForm']/div[1]/div[1]/div[10]/div/input")
	private WebElement siteRefTxtBox;
	
	public void enterSiteRef()
	{
		Random rand = new Random();
		int  n = rand.nextInt(998) + 1;
		siteRefTxtBox.sendKeys(n+"");
	}
	
	@FindBy(xpath="//form[@id='addSiteForm']/div[2]/div/div[3]/button")
	private WebElement addSiteBtn;
	
	public void clickAddSiteBtn()
	{
		addSiteBtn.click();
//		 WebDriverWait wait = new WebDriverWait(driver,30);
//		    WebElement element = wait.until(
//		                        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='toast-message']")));
//		Reporter.log(element.getText(),true);
//		
//		// Get a handle to the open alert, prompt or confirmation
//		Alert alert = driver.switchTo().alert();
//		// Get the text of the alert or prompt
//		Reporter.log(alert.getText(),true);  
//		// And acknowledge the alert (equivalent to clicking "OK")
//		//alert.accept();
		
		
//		new WebDriverWait(driver, 30)
//        .ignoring(StaleElementReferenceException.class)
//        .until((WebDriver d) -> {
//            
//          
//            Reporter.log( d.findElement(By.xpath("//div[@class='toast-message']")).getText(),true);
//            return true;
//        });
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("return window.stop");
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//	    WebElement element = wait.until(
//	                        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='toast-message']")));
//	    Reporter.log(element.getText(),true);
	}

//	@FindBy(xpath="//div[@class='toast-message']")
//	private WebElement toastMsg;
//	
}
