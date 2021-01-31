package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtility 
{
	//properties 
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	
	//constructor
	public TestUtility()
	{
		driver=null;
		wait=null;
	}
	
	//operational methods
	public RemoteWebDriver openBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		if(browsername.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
		if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return(driver);
	}
	
	public WebDriverWait defineWait(RemoteWebDriver driver)
	{
		wait=new WebDriverWait(driver,20);
		return(wait);
	}
	
	public void launchSite()
	{
		driver.get("http://www.google.com");
	}
	
	public void closeSite()
	{
		driver.close();
	}

}
