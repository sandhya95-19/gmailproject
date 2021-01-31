package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage
{
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(how=How.NAME,using="q")
	private WebElement e;
	
	@FindBy(how=How.LINK_TEXT,using="Gmail")
	private WebElement gmail;
	
	//constructor method
	public GooglePage(RemoteWebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=wait;
	}
	
	//operational method
	
	public void fillText(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(e)).sendKeys(x);
	}
	
	public void clickGmail()
	{
		wait.until(ExpectedConditions.elementToBeClickable(gmail)).click();
	}

}
