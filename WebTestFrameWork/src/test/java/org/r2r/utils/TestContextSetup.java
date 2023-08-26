package org.r2r.utils;

import org.openqa.selenium.WebDriver;
import org.r2r.pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

	public PageObjectManager pageObjectManager;
	public TestBase testBase;

	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());

	}
	
}
