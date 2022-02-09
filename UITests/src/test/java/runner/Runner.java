package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "classpath:steps" },
        tags = "@UITests",
        plugin = { "pretty", "json:target/cucumber-reports/status.json",
                "junit:target/cucumber-reports/statusJunit.xml"})

public class Runner {

}

