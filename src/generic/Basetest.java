package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements Auto_const{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://pazonodeserver.southeastasia.cloudapp.azure.com");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
