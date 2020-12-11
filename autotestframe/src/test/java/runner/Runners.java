package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;



@CucumberOptions(
        plugin = {
                "pretty",
                "html:src/main/resources/report",

        },
        tags = {"@tag1"},
        features = {"src/test/resources/features"},
        glue = "stepdef"
)
public class Runners extends AbstractTestNGCucumberTests {
}
