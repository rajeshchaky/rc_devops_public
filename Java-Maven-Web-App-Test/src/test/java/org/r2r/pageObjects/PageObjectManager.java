package org.r2r.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}


	public LandingPage getLandingPage()
	{
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}

//	public OffersPage OffersPage()
//	{
//		offersPage = new OffersPage(driver);
//		return offersPage;
//	}

}
