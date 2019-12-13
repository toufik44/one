package cucumberTest.TestNg.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/Feature",
		glue={"cucumberTest.TestNg.com"},
		plugin = { "pretty", "html:target/htmlreports" }
		)
public class TestRun {

}
