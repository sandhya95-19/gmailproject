package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.TestUtility;

public class Shared 
{
	public TestUtility tu;
	public RemoteWebDriver driver;
	public Scenario s;
	
	@Before
	public void method1(Scenario s)
	{
		driver=null;
		this.s=s;
		tu=new TestUtility();
	}
	
	@After
	public void method2(Scenario s)
	{
		s.log(s.getName()+" is completed");
	}

}
