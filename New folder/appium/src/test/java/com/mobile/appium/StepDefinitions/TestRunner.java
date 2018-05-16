package com.mobile.appium.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/mobile/appium",
        glue = "com.mobile.appium.StepDefinitions",
        tags = {"@Regression,@Smoke"},
        plugin = { "html:target/cucumber-report.html",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"
                }

        )
public class TestRunner extends AbstractTestNGCucumberTests{
}