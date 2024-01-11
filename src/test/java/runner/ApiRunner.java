package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@api",
        plugin = {"pretty","html:reports/api-cucumber.html", "json:reports/api-cucumber.json"}
)
public class ApiRunner {

}
