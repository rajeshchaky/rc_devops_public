Feature: To test the contact form

  @Test
  Scenario: Assert the webpage presence
    Given website is loaded
    Then check the presence of the assertion text

  @Test
  Scenario: Assert the presence of the firstname text box
    Given website is loaded
    Then check the presence of the Firstname Text box
    Then check the Text box by entering a value and save
    Then Assert the popup in the text box