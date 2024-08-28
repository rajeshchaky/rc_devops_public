package org.r2r.cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/org/r2r/features",glue ="org/r2r/stepDefinitions"
        ,monochrome=true, tags ="@Test",
        plugin= {"html:target/reports/cucumber_report/cucumber.html", "json:target/reports/cucumber_report/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/reports/cucumber_report/failed_scenarios.txt"})



public class TestRunTestNG extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
