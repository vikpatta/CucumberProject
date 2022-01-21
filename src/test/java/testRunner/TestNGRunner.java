package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty"},
features = "src/test/java/Featurefiles.features",
glue = "StepDefinitions"
)
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
