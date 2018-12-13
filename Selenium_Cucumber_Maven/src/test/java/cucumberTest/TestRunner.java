package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = true,
		features = "src/test/java/Features",
		glue={"stepDefinition"},
		monochrome=true,
		format={"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"}
	
		
		)
public class TestRunner 
{
	
}
