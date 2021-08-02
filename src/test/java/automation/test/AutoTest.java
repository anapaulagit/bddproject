package automation.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:automationTest"},
        glue = {"classpath:automation.test"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {"@happy"},
        strict = true
    )
public class AutoTest {
}

