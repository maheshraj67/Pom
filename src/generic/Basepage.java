package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public abstract class Basepage {
	public WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifytitle(String title)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		try{
			w.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is same",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not same",true);
			Assert.fail();
		}
	}
	
	public void verifyElementpresent(WebElement element)
	{
		WebDriverWait e=new WebDriverWait(driver,10);
		try{
			e.until(ExpectedConditions.visibilityOf(element));
			Reporter.log(element.getText() +" is present",true);
		}
		catch(Exception e1)
		{
			Reporter.log(element.getText() +" is not present",true);
			Assert.fail();
		}
	}
	
	public void loading(WebElement element)
	{
	long start = System.currentTimeMillis();

	try
	{
	WebDriverWait wd = new WebDriverWait(driver, 50);
	
	WebElement a = wd.until(ExpectedConditions.visibilityOf(element));
		
	System.out.println("Found :"+ a.getText()); 
	}
	catch(Exception ex)
	{
		System.out.println("Error :"+ex.getMessage()); 
	}
	
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for page load - "+totalTime); 

	}
}
