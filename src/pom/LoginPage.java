package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class LoginPage extends Basepage{

	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(id="password")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	
	public void verifyLoginPage(String lp)
	{
		verifytitle(lp);
	}
}
