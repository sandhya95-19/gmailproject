package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.GooglePage;
import utilities.TestUtility;

public class Stepdefs1 
{
	public GooglePage gp;
	public TestUtility tu;
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	public Shared sh;
	
	//constructor
	public Stepdefs1(Shared sh)
	{
		this.sh=sh;
	}
	@Given("^launch site using \"(.*)\"$")
	public void method1(String bn) throws Exception
	{
		sh.tu.openBrowser(bn);
		sh.tu.launchSite();
		Thread.sleep(2000);
	}
	
	@And("enter text in text box {string}")
	public void method2(String text)
	{
		
		gp=new GooglePage(sh.driver,wait);
		gp.fillText(text);
	}

	@And("click gmail button")
	public void method3()
	{
		gp=new GooglePage(sh.driver,wait);
		gp.clickGmail();
	}
	
	@And("close site")
	public void method4()
	{
		sh.tu.closeSite();
	}
}
