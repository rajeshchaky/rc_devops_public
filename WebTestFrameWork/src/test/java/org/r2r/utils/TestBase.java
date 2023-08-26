package org.r2r.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.r2r.factories.FrameworkConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(FrameworkConstants.getRESOURCEPATH()+"env.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		String browser = browser_maven!=null ? browser_maven : browser_properties;

		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome")){

				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*");
				System.setProperty("webdriver.chrome.driver",FrameworkConstants.getRESOURCEPATH()+"chromedriver");
				driver = new ChromeDriver(chromeOptions);
			}
			if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver",FrameworkConstants.getRESOURCEPATH()+"chromedriver");
				driver = new FirefoxDriver();
			}
			if(driver!=null){
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get(url);
			}
		}
		
		return driver;
		
	}
	
	
	
}

