package execution;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/execution/testeRipley.feature", plugin = {
		"json:target/Qualquercoisa.json", "pretty" }, glue = { "" }, monochrome = true, dryRun = false, strict = false)
public class SuiteTest {

}