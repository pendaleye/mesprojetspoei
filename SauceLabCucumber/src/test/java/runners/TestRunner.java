package runners;

import configuration.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "steps",
                "utils",
                "configuration"
        },
       // plugin = {"pretty", "html:target/cucumber-report.html"},
        plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber.json" },
        monochrome = true,
        tags = "@checkout"
       // tags="@POEI2-646"

)
public class TestRunner extends Hooks {
}
