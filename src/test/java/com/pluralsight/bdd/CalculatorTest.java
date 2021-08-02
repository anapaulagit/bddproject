package com.pluralsight.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:com.pluralsight.bdd"},
        glue = {"classpath:com.pluralsight.bdd"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        strict = true
    )
public class CalculatorTest {
}

