package com.virgingames.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Smart Tester
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/virgingames/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = ""
)

public class RunCukeTest extends AbstractTestNGCucumberTests {

}