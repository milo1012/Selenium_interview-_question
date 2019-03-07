package MyRunnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sharm\\eclipse-workspace\\bdd\\Features\\Login.feature", 
glue = { "stepDefinition" }, 
format = { "pretty", "html:test-output",
		"json:json_output/cucumber.json" })

public class TestRunnerclass {

}
