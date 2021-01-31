package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resources//feature1.feature"},
                  glue= {"gluecode"},
                  monochrome=false,
                  plugin= {"pretty","html:target\\googlepageresult","rerun:target\\failedgoogleres"})
public class Runner1 extends AbstractTestNGCucumberTests
{

}
