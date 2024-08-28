package org.r2r.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.AfterClass;
import org.r2r.factories.FrameworkConstants;
import org.r2r.utils.TestContextSetup;

import java.io.IOException;

public class Hooks {
    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
    }

    @BeforeAll
    public static void before_or_after_all(){
        System.setProperty("log4j2.configurationFile", FrameworkConstants.getRESOURCEPATH()+"log4j2.properties");
    }

    @After
    public void AfterScenario() throws IOException
    {
        testContextSetup.testBase.WebDriverManager().quit();
    }

}
