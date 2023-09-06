package org.r2r.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.r2r.pageObjects.LandingPage;
import org.r2r.utils.CustomAssertLoggers;
import org.r2r.utils.TestContextSetup;

import java.util.Objects;

public class TestFeatureStepDefs {
    TestContextSetup testContextSetup;
    public LandingPage landingPage;

    public TestFeatureStepDefs(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }
    private static final Logger log = LogManager.getLogger();

    @Given("^website is loaded$")
    public void websiteIsLoaded() {
        log.info("test started");
        CustomAssertLoggers.assertEquals("Title is matching", "Contact Form for Submission", landingPage.getTitleLandingPage());
    }

    @Then("check the presence of the assertion text")
    public void checkThePresenceOfTheAssertionText() {
        log.info("check the presence of the assertion text");
        if(Objects.equals(landingPage.findHeader(), "Hello MAC User!! Welcome to the World of Chasers!!!")
        &Objects.equals(landingPage.findSecondHeader(), "Please fill the Form and send the details to respective department")){
            CustomAssertLoggers.assertPass("Header 1 and header 2 is correct");

        }else{
            CustomAssertLoggers.assertFail("Header 1 and header 2 is not correct");
        }
    }

    @Then("check the presence of the Firstname Text box")
    public void checkThePresenceOfTheFirstnameTextBox() {
        log.info("check the presence of the Firstname Text box");
        if(landingPage.validatePresenceOfFirstNameTextBox()){
            CustomAssertLoggers.assertPass("firstname text box is present");

        }else{
            CustomAssertLoggers.assertFail("firstname text box is not present");
        }
    }

    @Then("check the Text box by entering a value and save")
    public void checkTheTextBoxByEnteringAValueAndSave() {
        log.info("check the Text box by entering a value and save");
        if(landingPage.validatePresenceOfFirstNameTextBox()){
            landingPage.AssertFirstNameTextBox("find");
        }else{
            CustomAssertLoggers.assertFail("Cannot type in the text box");
        }
    }

    @Then("Assert the popup in the text box")
    public void assertThePopupInTheTextBox() throws InterruptedException {
        log.info("Assert the popup in the text box");
        landingPage.validatePresenceOfSaveButton();
        CustomAssertLoggers.assertEquals("Alert text is coming as expected","first name saved",landingPage.captureFirstNameAlertText());
    }
}
