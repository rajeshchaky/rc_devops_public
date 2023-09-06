package org.r2r.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/org/r2r/features",glue ="org/r2r/stepDefinitions"
        ,monochrome=true, tags ="@Test",
        plugin= {"html:target/reports/cucumber_report/cucumber.html", "json:target/reports/cucumber_report/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/reports/cucumber_report/failed_scenarios.txt"})

public class RunBDDTest {

    @AfterClass
    public static void setup() {

    }
}
