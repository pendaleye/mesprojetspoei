package com.example.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // cucumber gere les dependances
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.automation.steps",
                "com.example.automation.utils",
                "com.example.automation.configuration"
        },
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TestRunner {
}
