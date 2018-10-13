package pom;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class ManageLocationSchedulePage extends Basepage{

	public ManageLocationSchedulePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//section/div/div/div[1]/div/a")
	private WebElement addScheduleBtn;
	
	public void clickAddScheduleBtn()
	{
		addScheduleBtn.click();
	}
	
	@FindBy(xpath="//form[@id='scheduleSettForm']/div[2]/input")
	private WebElement scheduleNameTxtBox;
	
	public void enterScheduleName()
	{
		String s = RandomStringUtils.randomAlphabetic(8);
		scheduleNameTxtBox.sendKeys("Location Schedule Automated "+s);
	}
		
	@FindBy(id="locSettToggle")
	private WebElement locationToggle;
	
	public void clickLocationbtn()
	{
		locationToggle.click();
	}
	
	@FindBy(xpath="//div[@id='locationFields']/table/tbody/tr[1]/td[1]/input")
	private WebElement locationValue;
	
	public void selectLocationValue()
	{
		locationValue.click();
	}
	
	@FindBy(xpath="//div[@id='selectLocationForm']/div/div/div[3]/button")
	private WebElement saveBtn;
	
	public void clickSaveBtn()
	{
		saveBtn.click();
	}
	
	@FindBy(xpath="//div[@id='scheduleCover']/div[2]/div[4]/div/input")
	private WebElement emailTxtField;
	
	public void enterEmail()
	{
		emailTxtField.sendKeys("trakdapp11@gmail.com");
	}
	
	@FindBy(xpath="//form[@id='scheduleSettForm']/div[8]/button[2]")
	private WebElement saveAndCloseBtn;
	
	public void clickSaveAndCloseBtn()
	{
		saveAndCloseBtn.click();
	}
	
	@FindBy(xpath="//div[@id='locationFields']/table/tbody/tr/td[1]")
	private List<WebElement> locCheckbox;
	
	public void chooseLocCheckbox()
	{
//		int i=0;
//		for(WebElement loc:locCheckbox)
//		{
//			i++;
//		}
		
		//int locSize=locCheckbox.size();
		Random random = new Random();
	    int index = random.nextInt(locCheckbox.size());
	    locCheckbox.get(index).click();
	}
	
}
