package org.r2r.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By header = By.xpath("/html/body/h1");
	By secondHeader=By.cssSelector("body > h2");
	By firstName = By.name("first_name");
	By firstNameSaveButton = By.xpath("//button[@onclick=\"alert('first name saved')\"]");


	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	public String findHeader()
	{
		return driver.findElement(header).getText();
	}
	public String findSecondHeader()
	{
		return driver.findElement(secondHeader).getText();
	}

	public boolean validatePresenceOfFirstNameTextBox()
	{
		boolean flag=false;
		if(driver.findElement(firstName).isEnabled()){
			flag=true;
		}
		return flag;
	}
	public void AssertFirstNameTextBox(String name)
	{
		driver.findElement(firstName).sendKeys(name);
	}
	public void validatePresenceOfSaveButton()
	{
		driver.findElement(firstNameSaveButton).isEnabled();
	}
	public String captureFirstNameAlertText() throws InterruptedException {
		driver.findElement(firstNameSaveButton).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		return alertMessage;
	}
	
}
